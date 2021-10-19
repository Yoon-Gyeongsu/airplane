package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Data
class Info implements Serializable {
	private String startTimeDay; // 출발시간
	private String flightName; // 운항편명
}

@Data
@Entity
@IdClass(Info.class)
public class airplayInfo {

	@Id
	@Column(name = "START_TIME_DAY")
	private String startTimeDay;

	@Id
	@Column(name = "FLIGHT_NAME")
	private String flightName;

	@Column(name = "ARRIVE_TIME_DAY")
	private String arriveTimeDay; // 도착시간
	@Column(name = "START")
	private String start; // 출발지
	@Column(name = "START_STATE")
	private String startState; // 출발현황
	@Column(name = "DESTINATION")
	private String destination; // 목적지
	@Column(name = "AIRLINR")
	private String airline; // 항공사
	@Column(name = "FEE")
	private Integer fee; // 운임비
	@Column(name = "AIRPORT")
	private String airport; // 공항
	@Column(name = "TERMINAL")
	private String terminal; // 터미널
	@Column(name = "CHECKIN_COUNTER")
	private String checkInCounter; // 체크인카운터
	@Column(name = "GATE")
	private String gate; // 탑승구
	
	public String getStartTimeDay() {
		return startTimeDay;
	}
	public void setStartTimeDay(String startTimeDay) {
		this.startTimeDay = startTimeDay;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getArriveTimeDay() {
		return arriveTimeDay;
	}
	public void setArriveTimeDay(String arriveTimeDay) {
		this.arriveTimeDay = arriveTimeDay;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getStartState() {
		return startState;
	}
	public void setStartState(String startState) {
		this.startState = startState;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getCheckInCounter() {
		return checkInCounter;
	}
	public void setCheckInCounter(String checkInCounter) {
		this.checkInCounter = checkInCounter;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
}
