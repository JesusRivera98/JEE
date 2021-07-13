/**
 * 
 */
package com.platzi.ereservation.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platzi.ereservation.model.Reservation;

/**
 * Interface to define database operations related to Reservation
 * @author jesus.rivera.flores
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, String>{

}
