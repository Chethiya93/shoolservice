package com.chethiya.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.chethiya.modal.School;

@ControllerAdvice
@RestController
public class CustomizeExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	public final ResponseEntity<School>handleIdnotFoundEX(IdNotFoundException ex, WebRequest request)
	{  
	ErrorDetail errorDetail = new ErrorDetail(request.getDescription(true),ex.getMessage(),new Date());
		
		return new ResponseEntity(errorDetail,HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	

}
