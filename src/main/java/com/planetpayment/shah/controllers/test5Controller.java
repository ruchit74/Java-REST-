package com.planetpayment.shah.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class test5Controller {
	
	
	/*@RequestMapping(value = "/service/creditcard/dispcreditcard", method = RequestMethod.GET)
	public String loadCreditCardDetail() {

		return "creditcarddata.jsp"; 
	}*/

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
		
		return "index.jsp";
	}
}