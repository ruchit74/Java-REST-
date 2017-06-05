package com.planetpayment.shah.service;

// Service Of the System which will also mask front 12 digits
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetpayment.shah.dao.CreditCardDAO;
import com.planetpayment.shah.form.CreditCardForm;
import com.planetpayment.shah.model.CreditCards;

@Service("creditCardService")
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardDAO creditCardDAO;

	public List<CreditCardForm> getCreditCardDataByName(String cardHolderName) {
		List<CreditCards> lstCreditCards = creditCardDAO
				.getCreditCardDataByName(cardHolderName);

		List<CreditCardForm> lstCreditCardForms = new ArrayList<CreditCardForm>();
		CreditCardForm creditCardForm;
		for (CreditCards creditCards : lstCreditCards) {
			creditCardForm = new CreditCardForm();

			creditCardForm.setCardHolderName(creditCards.getCardHolderName());
			creditCardForm.setCardNum(allStar(creditCards.getCardNum()));
			creditCardForm.setCardType(creditCards.getCardType());
			creditCardForm.setExpirationDate(creditCards.getExpirationDate());

			lstCreditCardForms.add(creditCardForm);
		}
		return lstCreditCardForms;
	}

	public List<CreditCardForm> getCreditCardDataByNum(Long cardNum) {
		List<CreditCards> lstCreditCards = creditCardDAO
				.getCreditCardDataByNum(cardNum);
		List<CreditCardForm> lstCreditCardForms = new ArrayList<CreditCardForm>();
		CreditCardForm creditCardForm;
		for (CreditCards creditCards : lstCreditCards) {
			creditCardForm = new CreditCardForm();

			creditCardForm.setCardHolderName(creditCards.getCardHolderName());
			creditCardForm.setCardNum(allStar(creditCards.getCardNum()));
			creditCardForm.setCardType(creditCards.getCardType());
			creditCardForm.setExpirationDate(creditCards.getExpirationDate());

			lstCreditCardForms.add(creditCardForm);
		}
		return lstCreditCardForms;
	}

	public String allStar(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		int length = s.length() - 4;
		for (int i = 0; i < length; i++) {
			sb.append('*');
		}
		sb.append(s.substring(length));
		return sb.toString();
	}

}
