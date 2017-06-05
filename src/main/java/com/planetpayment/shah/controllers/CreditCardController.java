package com.planetpayment.shah.controllers;

// Controller Of the System which handels the data
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.planetpayment.shah.form.CreditCardForm;
import com.planetpayment.shah.form.SearchCriteria;
import com.planetpayment.shah.service.CreditCardService;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@ExceptionHandler
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<Exception> handleException(MethodArgumentNotValidException exception) {
        return new ResponseEntity<Exception>(exception,  HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Exception> handleException2(Exception exception) {
        return new ResponseEntity<Exception>(exception,  HttpStatus.INTERNAL_SERVER_ERROR);
    }

	@ResponseBody

	@RequestMapping(value = "/search/api/getSearchResult", method = RequestMethod.POST, consumes={"application/x-www-form-urlencoded"})
	public AjaxResponseBody getSearchResultViaAjax(@ModelAttribute SearchCriteria search) {
		
		
		AjaxResponseBody result = new AjaxResponseBody();
		List<CreditCardForm> lstCardForm = new ArrayList<CreditCardForm>();
		if (search != null) {

			List<CreditCardForm> lstCreditCardForm = null;
			
			if (search.getUserdetails().matches("[0-9]+")) {
				
				lstCreditCardForm = creditCardService
						.getCreditCardDataByNum(Long.valueOf(search
								.getUserdetails()));
			} else {
				
				
				lstCreditCardForm = creditCardService
						.getCreditCardDataByName(search.getUserdetails());
			}
			
			if (lstCreditCardForm.size() > 0) {
				
				result.setCode("200");
				result.setMsg("Data");
				result.setResult(lstCreditCardForm);
			} else {
				result.setCode("204");
				result.setMsg("No data!");
			}
		} else {
			result.setCode("400");
			result.setMsg("Input Search criteria is empty!");
		}
		return result;
	}
}
