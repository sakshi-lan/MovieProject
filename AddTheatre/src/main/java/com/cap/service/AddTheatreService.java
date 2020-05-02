package com.cap.service;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.Movie;
import com.cap.bean.Theatre;
import com.cap.dao.AddTheatreDaoIn;
import com.cap.dao.MovieDao;
import com.cap.model.TheatreInfo;

@Service
@Transactional
public class AddTheatreService implements AddTheatreServiceIn {
	
	@Autowired
	  private AddTheatreDaoIn dao;
		
		@Autowired
		  private MovieDao movieDao;
		
		@Override
		public TheatreInfo addTheatre(TheatreInfo theatreInfo) {
			
			Optional<Movie> movie = movieDao.findById(theatreInfo.getMovieId());
			Theatre theatre = new Theatre();
			theatre.setMovie(movie.get());
		    theatre.setTheatreName(theatreInfo.getTheatreName());
		    theatre.setTheatreCity( theatreInfo.getTheatreCity());
		    theatre.setManagerName( theatreInfo.getManagerName());
		    theatre.setManagerContact(theatreInfo.getManagerContact());
		    
		    theatre = dao.save(theatre);
			
			
			theatreInfo.setTheatreId(theatre.getTheatreId());
			
			return theatreInfo;
		}
			

}
