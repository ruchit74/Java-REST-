package com.planetpayment.shah.service;

import java.util.List;

import com.planetpayment.shah.form.CreditCardForm;

public interface CreditCardService {

	List<CreditCardForm> getCreditCardDataByName(String cardHolderName);

	List<CreditCardForm> getCreditCardDataByNum(Long cardNum);
}
