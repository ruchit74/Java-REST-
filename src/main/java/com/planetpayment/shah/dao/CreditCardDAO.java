package com.planetpayment.shah.dao;

import java.util.List;

import com.planetpayment.shah.model.CreditCards;

public interface CreditCardDAO {

	List<CreditCards> getCreditCardDataByName(String cardHolderName);

	List<CreditCards> getCreditCardDataByNum(Long cardNum);

}
