package com.spring.login.exception;

import java.time.LocalDate;

/**
 * @author Saiqua Aslam
 *
 */
public class ErrorDetails {

	private String message;
	private LocalDate date;
	private String details;

	public ErrorDetails() {
	
	}

	public ErrorDetails(String message, LocalDate date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

}
