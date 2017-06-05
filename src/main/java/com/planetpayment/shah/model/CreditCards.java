package com.planetpayment.shah.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
@SuppressWarnings("serial")
public class CreditCards implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id", length = 11)
	private Long id;

	@Column(name = "expirationDate")
	String expirationDate;

	@Column(name = "cardType")
	String cardType;

	@Column(name = "cardHolderName")
	String cardHolderName;

	@Column(name = "cardNum")
	String cardNum;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

}
