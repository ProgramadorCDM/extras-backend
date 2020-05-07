package com.cdm.extrasbackend.utils.response;

import java.util.List;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * Clase de tipo Jwt response.
 * Clase donde creamos un objeto para trabajar con JWT
 */
public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	/**
	 * Instantiates a new Jwt response.
	 *
	 * @param accessToken the access token
	 * @param id          the id
	 * @param username    the username
	 * @param email       the email
	 * @param roles       the roles
	 */
	public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

	/**
	 * Gets access token.
	 *
	 * @return the access token
	 */
	public String getAccessToken() {
		return token;
	}

	/**
	 * Sets access token.
	 *
	 * @param accessToken the access token
	 */
	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	/**
	 * Gets token type.
	 *
	 * @return the token type
	 */
	public String getTokenType() {
		return type;
	}

	/**
	 * Sets token type.
	 *
	 * @param tokenType the token type
	 */
	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets email.
	 *
	 * @param email the email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets username.
	 *
	 * @param username the username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets roles.
	 *
	 * @return the roles
	 */
	public List<String> getRoles() {
		return roles;
	}
}
