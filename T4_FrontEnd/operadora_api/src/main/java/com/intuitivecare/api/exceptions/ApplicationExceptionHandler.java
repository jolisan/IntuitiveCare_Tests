package com.intuitivecare.api.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends Exception{
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception e) {
		Map<String, String> response = new HashMap<>();
		response.put("error", HttpStatus.BAD_REQUEST.toString());
		return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
	}
}
