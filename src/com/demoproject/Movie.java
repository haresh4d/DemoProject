package com.demoproject;

public class Movie {
	
	int id;
	String title;
	String director;
	int releaseYear;
	String category;
	
	public Movie() {
		
	}
	
	
	public Movie(int id, String title, String director, int releaseYear, String category) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.category = category;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
