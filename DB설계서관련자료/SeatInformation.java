package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SeatInformation {

	@Id
	private String seatNumber;

	@Column(name = "SEATCLASS")
	private String seatClass;

	@Column(name = "RESERVATIONCHECK")
	private String reservationCheck;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "START_TIME_DAY"),
		@JoinColumn(name = "FLIGHT_NAME")
	})
	private airplayInfo airplay; // 운항편명*/
}