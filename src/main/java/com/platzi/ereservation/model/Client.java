/**
 * 
 */
package com.platzi.ereservation.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Class representing the Customer table
 * @author jesus.rivera.flores
 *
 */
@Data
@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nameCli;
	private String surnameCli;
	private String identificationCli;
	private String addressCli;
	private String phoneCli;
	private String emailCli;

	@OneToMany(mappedBy="client")
	private Set <Reservation> reservations;

	public Client() {
		// TODO Auto-generated stub constructor
	} 

}
