package br.com.acalapi;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class AppAdvice {

	/*
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> e1(RuntimeException error){
		return new ResponseEntity<String>(error.getMessage(), HttpStatus.I_AM_A_TEAPOT);
	}
	*/
}