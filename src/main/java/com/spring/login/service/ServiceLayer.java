package com.spring.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.login.datajparepo.Repository;
import com.spring.login.model.LoginDetails;

/**
 * @author Saiqua Aslam
 *
 */

@Service
@Transactional
public class ServiceLayer implements IServiceLayer {
	@Autowired
	Repository repository;

	/**
	 * calling repository predefine layer method to to add a login details
	 */
	@Override
	public LoginDetails addLoginDetails(LoginDetails details) {
		return repository.save(details);
	}

	/**
	 * calling repository layer predefine method to view all the login details
	 * present in database
	 */

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		return repository.findAll();

	}

	/**
	 * calling repository layer predefine method to upadte login details
	 */
	@Override
	public LoginDetails updateLoginDetails(LoginDetails details) {
		return repository.save(details);

	}

	/**
	 * calling repository predefine layer method to view login details using id
	 */
	@Override
	public LoginDetails getLoginDetails(int id) {
		return repository.findById(id).orElse(null);
	}

	/**
	 * calling repository layer predefine method to delete login details using id
	 */
	@Override
	public String deleteLoginDetails(int id) {
		repository.deleteById(id);
		return "Details deleted suceesfully with the given id " + id;
	}

}
