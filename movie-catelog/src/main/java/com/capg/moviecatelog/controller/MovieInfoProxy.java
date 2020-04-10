package com.capg.moviecatelog.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.moviecatelog.model.MovieInfo;

@RibbonClient(value="movie-info-service")
//@FeignClient(value="movie-info-service")
public interface MovieInfoProxy {
	@GetMapping("movieinfo/{id}")
	public ResponseEntity<MovieInfo> getMovieInfo(@PathVariable("id") int id);
}
