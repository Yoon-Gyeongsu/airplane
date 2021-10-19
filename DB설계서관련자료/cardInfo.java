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
class card implements Serializable {
	@ManyToOne
	@JoinColumn(name = "RESERVATION_NUM")
	private paymentInfo PaymentInfo; // 예약번호
	@Column(name = "CARD_COMPANY")
	private String cardCompany; // 카드사	
}

@Entity
public class cardInfo implements Serializable{
	
	@EmbeddedId
    private card info;

	@Column(name = "INSTALL_MENTPLAN")
	private Integer installmentPlan; // 할부개월

	public card getInfo() {
		return info;
	}
	public void setInfo(card info) {
		this.info = info;
	}
	public Integer getInstallmentPlan() {
		return installmentPlan;
	}
	public void setInstallmentPlan(Integer installmentPlan) {
		this.installmentPlan = installmentPlan;
	}
}