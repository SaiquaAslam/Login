package com.spring.login;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.login.controller.LoginController;

/**
 * @author Saiqua Aslam
 *
 */
@SpringBootTest
class SpringLoginApplicationTests {

	@Autowired
	private LoginController controller;

	/**
	 * mehtod for testing the controller
	 */
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
