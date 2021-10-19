package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
class PointInfo implements Serializable {
	@Column(name = "POINT_NUM")
	private Integer pointNum; // 포인트번호
	@ManyToOne
	@JoinColumn(name = "CLINET_NUM")
	private client clientnum; // 예약번호
}

@Entity
public class point {
	
	@EmbeddedId
    private PointInfo info;
	
	@Column(name = "TIME_DAY")
	private String TimeDay;
	@Column(name = "DIVISION")
	private String division; // 구분
	@Column(name = "POINT_PRICE")
	private String pointPrice;
	@Column(name = "REASON")
	private String reason;
	
	public PointInfo getInfo() {
		return info;
	}
	public void setInfo(PointInfo info) {
		this.info = info;
	}
	public String getTimeDay() {
		return TimeDay;
	}
	public void setTimeDay(String timeDay) {
		TimeDay = timeDay;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPointPrice() {
		return pointPrice;
	}
	public void setPointPrice(String pointPrice) {
		this.pointPrice = pointPrice;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}