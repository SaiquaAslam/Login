package com.spring.login.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * @author Saiqua Aslam
 *
 */
@Entity
@Table(name = "Registration_Detail")
public class LoginDetails implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "Registration_id")
	private Integer registrationId;

	@Column(name = "User_Name")
	@NotEmpty(message = "Name should not be empty!!!")
	@NotNull(message = "Name should not be null. please provide a value")
	@Pattern(regexp = "[A-Z]{1}[a-z]+", message = "User name should be in Capital Letter only")
	private String userName;

	@Column(name = "Email_Id")
	@NotEmpty(message = "Email-Id should not be empty!!!")
	@NotNull(message = "Email-Id  should not be null. please provide a value")
	@Pattern(regexp = "[a-zA-Z0-9-._]{1,}[@]{1}[a-zA-Z]{1,}[.]{1}[a-zA-Z]{1,}", message = "Enter valid email id")
	private String emailId;

	@Column(name = "Password")
	@NotEmpty(message = "Password should not be empty!!!")
	@NotNull(message = "Password should not be null. please provide a value")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Please Use Strong Password!!!")
	private String password;

	
	public LoginDetails() {
		super();
	}

	public LoginDetails(String userName,String emailId,String password) {
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}

	public LoginDetails(Integer registrationId,String userName,String emailId,String password) {
	
		super();
		this.registrationId = registrationId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}

	/**
	 * @return the registrationId
	 */
	public Integer getRegistrationId() {
		return registrationId;
	}

	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetails [registrationId=" + registrationId + ", userName=" + userName + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}

}
