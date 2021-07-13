/**
 * 
 */
package com.platzi.ereservation.business.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.model.Client;
import com.platzi.ereservation.model.Reservation;


/**
 * Interface to define database operations related to Reservation
 * @author jesus.rivera.flores
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, String>{

	/**
	 * Method to consult reservations by client
	 * 
	 * @param client
	 * @return
	 */
	@Query("SELECT r FROM Reservation r WHERE r.client =:client")
	public List<Reservation> findByClient(Client client);
	
	/**
	 * Definition of method to consult reservations by the date 
	 * of entry based on a range of dates
	 * 
	 * @param dateStart
	 * @param dateExit
	 * @return
	 */
	@Query("SELECT r FROM Reservation r WHERE r.dateEntryRes =:dateStart  AND r.dateExitRes =:dateExit")
	public List<Reservation> find(@Param("dateStart") Date dateStart, @Param("dateExit") Date dateExit);
}
