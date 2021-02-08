package com.spring.login.exception;

/**
 * @author Saiqua Aslam
 *
 */

//customise exception class
public class RegistrationNotFoundException extends RuntimeException {

	public RegistrationNotFoundException() {
	
	}

	public RegistrationNotFoundException(String message) {
		super(message);
	}
}