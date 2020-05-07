package com.cdm.extrasbackend.utils.request;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * Clase tipo Login request.
 */
public class LoginRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	/**
	 * Obtiene el  username.
	 *
	 * @return el username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Modifica el username.
	 *
	 * @param username de username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Obtener el password.
	 *
	 * @return el password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Modifica el password.
	 *
	 * @param password de password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
