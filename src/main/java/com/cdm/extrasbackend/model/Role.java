package com.cdm.extrasbackend.model;

import javax.persistence.*;

/**
 *
 * @author Jorge.Mina
 * @version 06/05/2020/A
 *
 * Clase tipo Role.
 */
@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;

	/**
	 * Instancia un nuevo Role.
	 */
	public Role() {

	}

	/**
	 * Instancia un nuevo Role.
	 *
	 * @param name de name
	 */
	public Role(ERole name) {
		this.name = name;
	}

	/**
	 * Obtener id.
	 *
	 * @return de id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Modificar id.
	 *
	 * @param id de id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Obtener name.
	 *
	 * @return de name
	 */
	public ERole getName() {
		return name;
	}

	/**
	 * Modificar name.
	 *
	 * @param name de name
	 */
	public void setName(ERole name) {
		this.name = name;
	}
}