package com.siemens.spring.service;

import org.springframework.stereotype.Service;

@Service("MyMovieService")
public class MovieServiceImpl implements MovieService {

	@Override
	public void fetchMovie(int theatreId) {
		System.out.println("I am the movie!!!!!!");
	}

}
