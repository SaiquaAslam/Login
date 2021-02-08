package com.spring.login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.login.model.LoginDetails;
import com.spring.login.service.ServiceLayer;

/**
 * @author Saiqua Aslam
 *
 */
@SpringBootTest
class TestLogin {

	@Autowired
	private ServiceLayer service;

	/**
	 * testing service layer method to to add a login details
	 */
	@Test
	void testAddMethod() {
		LoginDetails details = service.addLoginDetails(new LoginDetails("Riyaa", "Riyaa123@gmail.com", "Riyaa@876"));

		assertEquals("Riyaa", details.getUserName());

	}

	/**
	 * testing service layer method to upadte login details
	 */
	@Test
	void testUpdateMethod() {
		LoginDetails details = service
				.updateLoginDetails(new LoginDetails(73, "Saiqua", "Saiqua1999@gmail.com", "Saiqua@123"));
		assertEquals("Saiqua@123", details.getPassword());
	}

	/**
	 * testing service layer method to delete login details using id
	 */
	@Test
	void testDeleteMethod() {
		String message = service.deleteLoginDetails(79);
		boolean result = false;
		if (message.equals(null))
			result = true;
		assertFalse(result);
	}

	void testGetDetails() {
		LoginDetails details = service.getLoginDetails(76);
		assertEquals("chahat123@gmail.com", details.getEmailId());
	}

	/**
	 * testing service layer method to view all the login details present in
	 * database
	 *
	 */
	@Test
	void testgetAllDetailss() {
		List<LoginDetails> list = service.getAllLoginDetails();
		boolean result = true;
		if (list.isEmpty()) {
			result = false;
		}
		assertTrue(result);
	}

}
