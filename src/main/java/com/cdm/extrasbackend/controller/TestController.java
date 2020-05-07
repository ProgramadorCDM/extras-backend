package com.cdm.extrasbackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Test controller.
 */
@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/test")
public class TestController {
	/**
	 * All access string.
	 *
	 * @return the string
	 */
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	/**
	 * User access string.
	 *
	 * @return the string
	 */
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}

	/**
	 * Moderator access string.
	 *
	 * @return the string
	 */
	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	/**
	 * Admin access string.
	 *
	 * @return the string
	 */
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
}
