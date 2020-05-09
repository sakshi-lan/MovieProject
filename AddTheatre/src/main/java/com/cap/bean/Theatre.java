package com.cap.bean;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="theatretab")
public class Theatre {
	
	@Id
	@SequenceGenerator(name="seq2", initialValue=2000, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq2")
	
	
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	private String managerName;
	private String managerContact;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", movie=" + movie + ", managerName=" + managerName + ", managerContact=" + managerContact + "]";
	}

}
