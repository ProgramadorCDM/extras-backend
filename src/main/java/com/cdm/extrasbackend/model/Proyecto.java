package com.cdm.extrasbackend.model;

import javax.persistence.*;

/**
 *
 * @author Jorge.Mina
 * @version 06/05/2020/A
 *
 * Clase tipo Proyecto.
 */
@Entity
@Table(name = "proyecto")
public class Proyecto {
    @Id
    private String idProyecto;
    @Column
    private String nombre;

    /**
     * Instancia un nuevo proyecto Proyecto.
     */
    public Proyecto() {
    }

    /**
     * Obtener idProyecto.
     *
     * @return idProyecto
     */
    public String getIdProyecto() {
        return idProyecto;
    }

    /**
     * Modificar idProyecto.
     *
     * @param id de id
     */
    public void setIdProyecto(String id) {
        this.idProyecto = id;
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

    @OneToOne(mappedBy = "proyecto", optional = false)
    private Registro registro;

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
}
