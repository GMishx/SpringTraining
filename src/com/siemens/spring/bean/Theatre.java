package com.siemens.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Theatre {

	private int id;
	private String name;
	private String location;
	private Movie movie;

	public Theatre() {
	}

	public Theatre(Movie movie) {
		this.setMovie(movie);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public Movie getMovie() {
		return movie;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Autowired
	@Required
	@Qualifier("movie2")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
}
