package com.planetpayment.shah.form;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

public class CreditCardForm {


	private String cardNum;

	private String cardHolderName;

	private String cardType;

	private String expirationDate;

	public CreditCardForm(String cardNum, String cardHolderName,
			String cardType, String expirationDate) {
		super();
		this.cardNum = cardNum;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.expirationDate = expirationDate;
	}

	public CreditCardForm() {
		// TODO Auto-generated constructor stub
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
