package com.example.demo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class paymentInfo implements Serializable{
	
	@Column(name = "PRICE")
	private Integer price; // 결재가격
	
	@Column(name = "PAYMENTKIND")
	private String paymentKind; // 결재종류
	
	@Id
	@ManyToOne
	@JoinColumn(name = "RESERVATION_NUM")
	private reservation Reservation; // 예약번호

}