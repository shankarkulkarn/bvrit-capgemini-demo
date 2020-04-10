package com.capg.moviecatelog.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.capg.moviecatelog.model.MovieRating;

@RibbonClient(value="movie-rating-service" )
//@FeignClient(value="movie-rating-service")
public interface MovieRatingProxy {
	@GetMapping("rating/{id}")
	public MovieRating getMovieRating(@PathVariable("id") int id);
}