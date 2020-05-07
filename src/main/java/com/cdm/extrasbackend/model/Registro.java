package com.cdm.extrasbackend.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jorge.Mina
 * @version 06/05/2020/A
 *
 * Clase de tipo Registro.
 */
@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate fecha;
    @Column
    private LocalTime hora_entrada;
    @Column
    private LocalTime hora_salida;
    @Column
    private Double hora_ordinaria;
    @Column
    private Double recargo_nocturno;
    @Column
    private Double hora_extra;
    @Column
    private Double hora_extra_nocturna;
    @Column
    private Double hora_extra_festiva;
    @Column
    private Double hora_extra_festiva_nocturna;
    @OneToOne
    @JoinColumn(name = "cedula")
    private Persona persona;
    @OneToOne
    @JoinColumn(name = "idProyecto")
    private Proyecto proyecto;
    @Column
    private boolean festivo;
    @Column
    private Double salario_sin_prestaciones;
    @Column
    private Double salario_con_prestaciones;

    /**
     * Instancia un nuevo Registro.
     */
    public Registro() {
    }

    /**
     * Obtener id.
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Modificar id.
     *
     * @param id de id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtener fecha.
     *
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Modificar fecha.
     *
     * @param fecha de fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtener hora entrada.
     *
     * @return hora entrada
     */
    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    /**
     * Modificar hora entrada.
     *
     * @param hora_entrada de hora entrada
     */
    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    /**
     * Obtener hora salida.
     *
     * @return hora salida
     */
    public LocalTime getHora_salida() {
        return hora_salida;
    }

    /**
     * Modificar hora salida.
     *
     * @param hora_salida de hora salida
     */
    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    /**
     * Obtener hora ordinaria.
     *
     * @return hora ordinaria
     */
    public Double getHora_ordinaria() {
        return hora_ordinaria;
    }

    /**
     * Modificar hora ordinaria.
     *
     * @param hora_ordinaria de hora ordinaria
     */
    public void setHora_ordinaria(Double hora_ordinaria) {
        this.hora_ordinaria = hora_ordinaria;
    }

    /**
     * Obtener recargo nocturno.
     *
     * @return recargo nocturno
     */
    public Double getRecargo_nocturno() {
        return recargo_nocturno;
    }

    /**
     * Modificar recargo nocturno.
     *
     * @param recargo_nocturno de recargo nocturno
     */
    public void setRecargo_nocturno(Double recargo_nocturno) {
        this.recargo_nocturno = recargo_nocturno;
    }

    /**
     * Obtener hora extra.
     *
     * @return hora extra
     */
    public Double getHora_extra() {
        return hora_extra;
    }

    /**
     * Modificar hora extra.
     *
     * @param hora_extra de hora extra
     */
    public void setHora_extra(Double hora_extra) {
        this.hora_extra = hora_extra;
    }

    /**
     * Obtener hora extra nocturna.
     *
     * @return hora extra nocturna
     */
    public Double getHora_extra_nocturna() {
        return hora_extra_nocturna;
    }

    /**
     * Modificar hora extra nocturna.
     *
     * @param hora_extra_nocturna de hora extra nocturna
     */
    public void setHora_extra_nocturna(Double hora_extra_nocturna) {
        this.hora_extra_nocturna = hora_extra_nocturna;
    }

    /**
     * Obtener hora extra festiva.
     *
     * @return hora extra festiva
     */
    public Double getHora_extra_festiva() {
        return hora_extra_festiva;
    }

    /**
     * Modificar hora extra festiva.
     *
     * @param hora_extra_festiva de hora extra festiva
     */
    public void setHora_extra_festiva(Double hora_extra_festiva) {
        this.hora_extra_festiva = hora_extra_festiva;
    }

    /**
     * Obtener hora extra festiva nocturna.
     *
     * @return hora extra festiva nocturna
     */
    public Double getHora_extra_festiva_nocturna() {
        return hora_extra_festiva_nocturna;
    }

    /**
     * Modificar hora extra festiva nocturna.
     *
     * @param hora_extra_festiva_nocturna de hora extra festiva nocturna
     */
    public void setHora_extra_festiva_nocturna(Double hora_extra_festiva_nocturna) {
        this.hora_extra_festiva_nocturna = hora_extra_festiva_nocturna;
    }

    /**
     * Obtener persona.
     *
     * @return persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Modificar persona.
     *
     * @param persona de persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Obtener proyecto.
     *
     * @return proyecto
     */
    public Proyecto getProyecto() {
        return proyecto;
    }

    /**
     * Modificar proyecto.
     *
     * @param proyecto de proyecto
     */
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * Is festivo boolean.
     *
     * @return boolean
     */
    public boolean isFestivo() {
        return festivo;
    }

    /**
     * Modificar festivo.
     *
     * @param festivo de festivo
     */
    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }

    /**
     * Obtener salario sin prestaciones.
     *
     * @return salario sin prestaciones
     */
    public Double getSalario_sin_prestaciones() {
        return salario_sin_prestaciones;
    }

    /**
     * Modificar salario sin prestaciones.
     *
     * @param salario_sin_prestaciones de salario sin prestaciones
     */
    public void setSalario_sin_prestaciones(Double salario_sin_prestaciones) {
        this.salario_sin_prestaciones = salario_sin_prestaciones;
    }

    /**
     * Obtener salario con prestaciones.
     *
     * @return salario con prestaciones
     */
    public Double getSalario_con_prestaciones() {
        return salario_con_prestaciones;
    }

    /**
     * Modificar salario con prestaciones.
     *
     * @param salario_con_prestaciones de salario con prestaciones
     */
    public void setSalario_con_prestaciones(Double salario_con_prestaciones) {
        this.salario_con_prestaciones = salario_con_prestaciones;
    }
}
