package com.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {
	
	@ExceptionHandler(value=ProductNotFound.class)
	 public ResponseEntity<Object> exception(ProductNotFound exception) {
	      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	   }

}
