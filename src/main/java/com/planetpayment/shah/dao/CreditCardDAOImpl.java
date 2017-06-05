package com.planetpayment.shah.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.planetpayment.shah.model.CreditCards;

@Repository("creditCardDAO")
@Transactional(rollbackFor =Exception.class)
public class CreditCardDAOImpl implements CreditCardDAO {

	@Autowired  SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<CreditCards> getCreditCardDataByName(String cardHolderName) {

		Session session = sessionFactory.openSession();

		// Query using Hibernate Query Language
		final Criteria crit = session.createCriteria(CreditCards.class);
		crit.add(Restrictions
				.like("cardHolderName", "%" + cardHolderName + "%"));
		List<CreditCards> lstCreditCards = crit.list();
		session.close();
		return lstCreditCards;
	}

	public List<CreditCards> getCreditCardDataByNum(Long cardNum) {

		Session session = sessionFactory.openSession();

		// Query using Hibernate Query Language
		final Criteria crit = session.createCriteria(CreditCards.class);
		crit.add(Restrictions.like("cardNum", String.valueOf(cardNum),
				MatchMode.END));
		List<CreditCards> lstCreditCards = crit.list();
		session.close();
		return lstCreditCards;
	}

}
