/**
 * 
 */
package com.platzi.ereservation.business.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.model.Client;
import com.platzi.ereservation.business.repository.ClientRepository;

/**
 * Class to define client services
 * @author jesus.rivera.flores
 *
 */
@Service
public class ClientService {
	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	/**
	 * Method to perform the save operation of a client
	 * 
	 * @param client
	 * @return
	 */
	@Transactional
	public Client create(Client client) {
		return this.clientRepository.save(client);
	}

	/**
	 * Method to perform the operation of updating a client
	 * 
	 * @param client
	 * @return
	 */
	@Transactional
	public Client update(Client client) {
		return this.clientRepository.save(client);
	}

	/**
	 * Method to perform the operation of removing a client
	 * 
	 * @param client
	 */
	@Transactional
	public void delete(Client client) {
		this.clientRepository.delete(client);
	}

	/**
	 * Method to consult a client by its identification
	 * 
	 * @param identificationCli
	 * @return
	 */
	public Client findByIdentification(String identificationCli) {
		return this.clientRepository.findByIdentification(identificationCli);
	}
	
	/**
	 * Method to consult all clients
	 * @return
	 */
	public List<Client> findAll(){
		return this.clientRepository.findAll();
	}
	
	/**
	 * Method to search clients by their last name
	 * @param surnameCli
	 * @return
	 */
	public List<Client> findBySurnameCli(String surnameCli){
		return this.clientRepository.findBySurnameCli(surnameCli);
	}
	
	
	/**
	 * Method to search for a client by email account
	 * @param email
	 * @return
	 */
	public Client findByEmailAccount(String email) {
		return this.findByEmailAccount(email);
	}
}
