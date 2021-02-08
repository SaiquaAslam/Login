package com.spring.login.service;

import java.util.List;

import com.spring.login.model.LoginDetails;

/**
 * @author Saiqua Aslam
 *
 */
public interface IServiceLayer {
	LoginDetails addLoginDetails(LoginDetails details); // to add login details

	List<LoginDetails> getAllLoginDetails(); // get all login details from database

	LoginDetails updateLoginDetails(LoginDetails details); // to update a login details

	LoginDetails getLoginDetails(int id); // to get login details using id

	String deleteLoginDetails(int id); // to delete login details using id
}
