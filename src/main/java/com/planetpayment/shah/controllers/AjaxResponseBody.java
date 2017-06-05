package com.planetpayment.shah.controllers;



import java.io.Serializable;
import java.util.List;

import com.planetpayment.shah.form.CreditCardForm;

public class AjaxResponseBody implements Serializable{
	private static final long serialVersionUID = 6851443195481943707L;

	String msg;

	String code;

	List<CreditCardForm> result;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<CreditCardForm> getResult() {
		return result;
	}

	public void setResult(List<CreditCardForm> result) {
		this.result = result;
	}

}
