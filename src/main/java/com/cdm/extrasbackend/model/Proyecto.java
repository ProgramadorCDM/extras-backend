package com.cdm.extrasbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    private String idProyecto;
    @Column
    private String nombre;

    public Proyecto() {
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String id) {
        this.idProyecto = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
