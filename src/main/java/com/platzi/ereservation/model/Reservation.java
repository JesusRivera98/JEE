/**
 * 
 */
package com.platzi.ereservation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Class representing the reservation table
 * @author jesus.rivera.flores
 *
 */

@Data
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idRes;
	private Date dateEntryRes;
	private Date dateExitRes;
	private int amountPeopleRes;
	private String descriptionRes;
	@ManyToOne
	@JoinColumn(name="idCli")
	private Client client;
}
