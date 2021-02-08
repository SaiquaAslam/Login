package com.spring.login.datajparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.login.model.LoginDetails;

/**
 * @author Saiqua Aslam
 *
 */

public interface Repository extends JpaRepository<LoginDetails, Integer>{

}
