/**
 * 
 */
package com.platzi.ereservation.view.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.ereservation.model.Client;
import com.platzi.ereservation.business.services.ClientService;
import com.platzi.ereservation.view.resources.vo.ClientVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Class that represents
 * 
 * @author jesus.rivera.flores
 *
 */
@RestController
@RequestMapping("/api/client")
@Api(tags = "cliente")
public class ClientResource {
	private final ClientService clientService;

	public ClientResource(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping
	@ApiOperation(value = "Create Client", notes = "Service to create a new customer")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Successfully created client"),
			@ApiResponse(code = 400, message = "Invalid Request") })
	public ResponseEntity<Client> createClient(@RequestBody ClientVO clientVo) {
		Client client = new Client();
		client.setNameCli(clientVo.getNameCli());
		client.setSurnameCli(clientVo.getSurnameCli());
		client.setAddressCli(clientVo.getAddressCli());
		client.setPhoneCli(clientVo.getPhoneCli());
		client.setEmailCli(clientVo.getEmailCli());
		return new ResponseEntity<>(this.clientService.create(client), HttpStatus.CREATED);
	}

	@PutMapping("/{identification}")
	@ApiOperation(value = "Update Client", notes = "Service to update a client")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Client successfully updated"),
			@ApiResponse(code = 404, message = "Client not found") })
	public ResponseEntity<Client> updateClient(@PathVariable("identification") String identification,
			ClientVO clientVo) {

		Client client = this.clientService.findByIdentification(identification);
		if (client == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		} else {
			client.setNameCli(clientVo.getNameCli());
			client.setSurnameCli(clientVo.getSurnameCli());
			client.setAddressCli(clientVo.getAddressCli());
			client.setPhoneCli(clientVo.getPhoneCli());
			client.setEmailCli(clientVo.getEmailCli());
		}
		return new ResponseEntity<>(this.clientService.update(client), HttpStatus.OK);
	}

	@DeleteMapping("/{identification}")
	@ApiOperation(value = "Delete Client", notes = "Service to delete a cliente")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Successfully removed client"),
			@ApiResponse(code = 404, message = "Client not found") })
	public void removeClient(@PathVariable("identification") String identification) {
		Client client = this.clientService.findByIdentification(identification);
		if (client != null) {
			this.clientService.delete(client);
		}
	}

	@GetMapping
	@ApiOperation(value = "List Clients", notes = "Service to list all clients")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Clients found"),
			@ApiResponse(code = 404, message = "Clients not found") })
	public ResponseEntity<List<Client>> findAll() {
		return ResponseEntity.ok(this.clientService.findAll());
	}
}
