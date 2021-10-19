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
	private Integer reservationNum;
	
	@Column(name = "GEUSETS_NUM")
	private String guestsNum;  //탑승객수
	@Column(name = "CHECKIN_STATE")
	private String checkInState;
	
	@ManyToOne
	@JoinColumn(name = "CLINET_NUM")
	private client clientnum; // 예약번호
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "START_TIME_DAY"),
		@JoinColumn(name = "FLIGHT_NAME")
	})
	private airplayInfo airplay; // 운항편명*/
	
	public Integer getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(Integer reservationNum) {
		this.reservationNum = reservationNum;
	}
	public String getGuestsNum() {
		return guestsNum;
	}
	public void setGuestsNum(String guestsNum) {
		this.guestsNum = guestsNum;
	}
	public String getCheckInState() {
		return checkInState;
	}
	public void setCheckInState(String checkInState) {
		this.checkInState = checkInState;
	}
	public client getClientnum() {
		return clientnum;
	}
	public void setClientnum(client clientnum) {
		this.clientnum = clientnum;
	}
	public airplayInfo getAirplay() {
		return airplay;
	}
	public void setAirplay(airplayInfo airplay) {
		this.airplay = airplay;
	}
}