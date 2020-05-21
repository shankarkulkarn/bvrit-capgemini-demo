package com.capg.moviecatelog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.moviecatelog.exception.MovieException;
import com.capg.moviecatelog.model.CatelogItem;
import com.capg.moviecatelog.model.MovieDetail;
import com.capg.moviecatelog.model.MovieInfo;
import com.capg.moviecatelog.model.MovieRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class MovieCatelogController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/movie")
	public ResponseEntity<List<MovieInfo>>  getMovie()
	{
		ResponseEntity<MovieDetail> md = restTemplate.getForEntity("http://movie-info-service/movieinfo",MovieDetail.class);
		List<MovieInfo> list = md.getBody().getList();
		
		ResponseEntity<List<MovieInfo>>  re= new ResponseEntity<>(list,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("/movie/{id}")
	@HystrixCommand(fallbackMethod="fallBackMovieCatelogItem")
	public ResponseEntity<CatelogItem> getMovieCatelogItem(@PathVariable int id) throws MovieException {

	
	
	ResponseEntity<MovieRating> ratingEntity=restTemplate.getForEntity("http://movie-rating-service/rating/"+id, MovieRating.class);

   ResponseEntity<MovieInfo> infoEntity=restTemplate.getForEntity("http://movie-info-service/movieinfo/"+id, MovieInfo.class);
		
	
		
   if(infoEntity.getStatusCode()==HttpStatus.NOT_FOUND)
	{
		
		throw new MovieException("MOVIE "+ id +" NOT FOUND ");
	}
   
   
	MovieInfo info=infoEntity.getBody();

	MovieRating rating=ratingEntity.getBody();
		
		
		ResponseEntity<CatelogItem> catelogEntity;
		CatelogItem item;
		item=new CatelogItem(id,info.getMovieTitle(),info.getMovieDescription(),rating.getRating());
			
			catelogEntity=new ResponseEntity<>(item,HttpStatus.OK);

		
		return catelogEntity;
	}
	
	public ResponseEntity<CatelogItem> fallBackMovieCatelogItem(@PathVariable int id) throws MovieException
	{
		  
		ResponseEntity<CatelogItem> catelogEntity;
		CatelogItem item;
		item=new CatelogItem(id," MOVIE SERVICE IS DOWN ","",0.0);
			
			catelogEntity=new ResponseEntity<>(item,HttpStatus.NOT_FOUND);
			return catelogEntity;
	}
	
}
