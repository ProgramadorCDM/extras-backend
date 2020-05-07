package com.cdm.extrasbackend.utils.response;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * The type Message response.
 */
public class MessageResponse {
	private String message;

	/**
	 * Instantiates a new Message response.
	 *
	 * @param message the message
	 */
	public MessageResponse(String message) {
	    this.message = message;
	  }

	/**
	 * Gets message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets message.
	 *
	 * @param message the message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
