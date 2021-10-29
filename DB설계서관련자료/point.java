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
	

}