/**
 * 
 */
package com.platzi.ereservation.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.model.Client;

/**
 * Interface to define database operations related to client
 * @author jesus.rivera.flores
 *
 */
public interface ClientRepository extends JpaRepository<Client, String>{

	/**
	 * Definition of method to search customers by their last name
	 * @param surnameCli
	 * @return
	 */
	public List<Client> findBySurnameCli(String surnameCli);
	
	/**
	 * Definition of method to search for a customer by identification
	 * @param identificationCli
	 * @return
	 */
	public Client findByIdentificationCli(String identificationCli);
	
	/**
	 * Definition of method to search for a customer by email account
	 * @param email
	 * @return
	 */
	@Query("SELECT c FROM Client c WHERE c.emailCli LIKE %:email")
	public Client findByEmailAccount(@Param("email") String email);
}
