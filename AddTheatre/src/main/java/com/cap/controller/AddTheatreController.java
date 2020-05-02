package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.model.TheatreInfo;
import com.cap.service.AddTheatreServiceIn;

@RestController
@CrossOrigin("http://localhost:9090")
public class AddTheatreController {
	
	
	@Autowired
	private AddTheatreServiceIn service;
	
	@PostMapping("/add/theatre")
	public TheatreInfo addTheatre(@RequestBody TheatreInfo theatre) {
		TheatreInfo m = service.addTheatre(theatre);
		if(m != null) {
			return m;
		}
		else {
			return m;
		}
	}

}
