package com.capg.movierating.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.movierating.model.MovieRating;

@Repository
public interface MovieRatingDao extends JpaRepository<MovieRating,Number>{

}
