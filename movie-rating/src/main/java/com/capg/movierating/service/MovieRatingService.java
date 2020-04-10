package com.capg.movierating.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movierating.dao.MovieRatingDao;
import com.capg.movierating.exception.MovieException;
import com.capg.movierating.model.MovieRating;

@Service
public class MovieRatingService {
	
	
    @Autowired
	MovieRatingDao  movieRatingDao;
    
	public MovieRating getMovieRatingById(int id) throws MovieException {
		
		
		if(!movieRatingDao.existsById(id))
		{
			 throw new MovieException(" ID NOT FOUND");
		}
		return movieRatingDao.findById(id).get();
	}
}
