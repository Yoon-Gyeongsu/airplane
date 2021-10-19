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
class bankInfo implements Serializable {
	@ManyToOne
	@JoinColumn(name = "RESERVATION_NUM")
	private paymentInfo PaymentInfo; // 예약번호
	@Column(name = "BANK_COMPANY")
	private String bankCompany; // 은행사
}

@Entity
public class bank {
	
	@EmbeddedId
    private bankInfo info;
	
	@Column(name = "ARRIVE_TIME_DAY")
	private String accountNum; // 계좌번호

	public bankInfo getInfo() {
		return info;
	}
	public void setInfo(bankInfo info) {
		this.info = info;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
}