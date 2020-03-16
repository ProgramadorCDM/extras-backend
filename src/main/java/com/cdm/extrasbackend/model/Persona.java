package com.cdm.extrasbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    private String cedula;
    @Column
    private String nombre;
    @Column
    private Double salario;

    public Persona() {}

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String id) {
        this.cedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
