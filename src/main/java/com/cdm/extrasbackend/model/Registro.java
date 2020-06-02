package com.cdm.extrasbackend.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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
    @Column
    private String actividad;
    @Column
    private String users;

    public Registro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public LocalTime getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(LocalTime hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Double getHora_ordinaria() {
        return hora_ordinaria;
    }

    public void setHora_ordinaria(Double hora_ordinaria) {
        this.hora_ordinaria = hora_ordinaria;
    }

    public Double getRecargo_nocturno() {
        return recargo_nocturno;
    }

    public void setRecargo_nocturno(Double recargo_nocturno) {
        this.recargo_nocturno = recargo_nocturno;
    }

    public Double getHora_extra() {
        return hora_extra;
    }

    public void setHora_extra(Double hora_extra) {
        this.hora_extra = hora_extra;
    }

    public Double getHora_extra_nocturna() {
        return hora_extra_nocturna;
    }

    public void setHora_extra_nocturna(Double hora_extra_nocturna) {
        this.hora_extra_nocturna = hora_extra_nocturna;
    }

    public Double getHora_extra_festiva() {
        return hora_extra_festiva;
    }

    public void setHora_extra_festiva(Double hora_extra_festiva) {
        this.hora_extra_festiva = hora_extra_festiva;
    }

    public Double getHora_extra_festiva_nocturna() {
        return hora_extra_festiva_nocturna;
    }

    public void setHora_extra_festiva_nocturna(Double hora_extra_festiva_nocturna) {
        this.hora_extra_festiva_nocturna = hora_extra_festiva_nocturna;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public boolean isFestivo() {
        return festivo;
    }

    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }

    public Double getSalario_sin_prestaciones() {
        return salario_sin_prestaciones;
    }

    public void setSalario_sin_prestaciones(Double salario_sin_prestaciones) {
        this.salario_sin_prestaciones = salario_sin_prestaciones;
    }

    public Double getSalario_con_prestaciones() {
        return salario_con_prestaciones;
    }

    public void setSalario_con_prestaciones(Double salario_con_prestaciones) {
        this.salario_con_prestaciones = salario_con_prestaciones;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
