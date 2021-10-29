package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
}
