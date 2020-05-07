package com.cdm.extrasbackend.model;

import javax.persistence.*;

/**
 *
 * @author Jorge.Mina
 * @version 06/05/2020/A
 *
 * Clase tipo Persona.
 */
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    private String cedula;
    @Column
    private String nombre;
    @Column
    private Double salario;

    /**
     * Instancia una Nueva Persona
     */
    public Persona() {}

    /**
     * Obtener cedula.
     *
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Modificar cedula.
     *
     * @param id de cedula
     */
    public void setCedula(String id) {
        this.cedula = id;
    }

    /**
     * Obtener nombre.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar nombre.
     *
     * @param nombre de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener salario.
     *
     * @return salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * Modificar salario.
     *
     * @param salario de salario
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
