package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;



@SpringBootApplication
public class AddMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddMovieApplication.class, args);
	}

}
