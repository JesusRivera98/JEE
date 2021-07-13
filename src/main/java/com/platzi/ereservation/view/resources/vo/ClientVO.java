/**
 * 
 */
package com.platzi.ereservation.view.resources.vo;

import lombok.Data;

/**
 * Class representing the Client table
 * @author jesus.rivera.flores
 *
 */
@Data
public class ClientVO {
	private String nameCli;
	private String surnameCli;
	private String identificationCli;
	private String addressCli;
	private String phoneCli;
	private String emailCli;
}
