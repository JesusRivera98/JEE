/**
 * 
 */
package com.platzi.ereservation.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platzi.ereservation.model.Client;

/**
 * Interface to define database operations related to client
 * @author jesus.rivera.flores
 *
 */
public interface ClientRepository extends JpaRepository<Client, String>{

}
