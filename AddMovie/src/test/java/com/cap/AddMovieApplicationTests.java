package com.cap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Movie;
import com.cap.service.AddMovieServiceIn;


@SpringBootTest
class AddMovieApplicationTests {

	@Autowired
	private AddMovieServiceIn service;
	
	@Test
	public void addMovie(){
		Movie m = new Movie();
		m.setMovieId(111);
		m.setLanguages("hindi");
		m.setMovieDirector("rohit shetty");
		m.setMovieGenre("action");
		m.setMovieLength("3 hrs");
		m.setMovieName("singham");
		
		m.setMovieReleaseDate("12-05-2020");
		Movie m1 = service.addMovie(m);
		System.out.println(m1.toString());
		Assertions.assertEquals(m.toString(), m1.toString());
	}
}
