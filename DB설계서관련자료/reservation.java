package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RESERVATION_NUM")
	private Integer reservationNum;  // 예약번호
	
	@Column(name = "GEUSETS_NUM")
	private String guestsNum;  //탑승객수
	@Column(name = "CHECKIN_STATE")
	private String checkInState;
	
	@ManyToOne
	@JoinColumn(name = "CLINET_NUM")
	private client clientnum; //고객번호
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "START_TIME_DAY"),
		@JoinColumn(name = "FLIGHT_NAME")
	})
	private airplayInfo airplay; // 운항편명*/
	
}