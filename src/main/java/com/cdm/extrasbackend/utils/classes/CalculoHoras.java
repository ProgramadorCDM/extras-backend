package com.cdm.extrasbackend.utils.classes;

import com.cdm.extrasbackend.model.Registro;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jorge Mina
 * @version 06/05/2020/A
 *
 * Clase de tipo Calculo horas.
 */
public class CalculoHoras {
    /* Declaración de variables no modificar */
    private int hora;
    private int minuto;
    private final int segundo =0;
    private int festivo;
    private final String[] horas = {
            "0","1","2","3","4","5","6","7","8","9","10","11","12",
            "13","14","15","16","17","18","19","20","21","22","23"};
    private final String[] minutos = { "0","30","59" };
    private double recargosnocturos = 0;
    private double horasordinarias = 0;
    private double horasExtrasOrdinarias = 0;
    private double horasExtrasNocturnas = 0;
    private double horasExtrasOrdinariasFestivas = 0;
    private double horasExtrasNocturnasFestivas = 0;
    private double salarioSinPrestaciones = 0;
    private double salarioConPrestaciones = 0;
    private final double prestaciones = 1.22;
    /**
     * Constante Formato hora.
     */
    final String formatoHora = "HH:mm:ss";

    /**
     * Constante Recargo Nocturno(Rn) 1.
     */
    final LocalTime rn1 = LocalTime.of(21, 0, segundo);
    /**
     * Constante Recargo Nocturno(Rn) 2.
     */
    final LocalTime rn2 = LocalTime.of(23, 59, segundo);
    /**
     * Constante Recargo Nocturno(Rn) 3.
     */
    final LocalTime rn3 = LocalTime.of(0, 0, segundo);
    /**
     * Constante Recargo Nocturno(Rn) 4.
     */
    final LocalTime rn4 = LocalTime.of(6, 0, segundo);

    /**
     * Instancia un nuevo objeto Calculo horas.
     */
    public CalculoHoras() {
    }


    /**
     * Obtener hora.
     *
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Modificar hora.
     *
     * @param hora the hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Obtener minuto.
     *
     * @return the minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Modificar minuto.
     *
     * @param minuto the minuto
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Obtener segundo.
     *
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Obtener festivo.
     *
     * @return the festivo
     */
    public int getFestivo() {
        return festivo;
    }

    /**
     * Modificar festivo.
     *
     * @param festivo the festivo
     */
    public void setFestivo(int festivo) {
        this.festivo = festivo;
    }

    /**
     * Get horas string [ ].
     *
     * @return the string [ ]
     */
    public String[] getHoras() {
        return horas;
    }

    /**
     * Get minutos string [ ].
     *
     * @return the string [ ]
     */
    public String[] getMinutos() {
        return minutos;
    }

    /**
     * Obtener recargosnocturos.
     *
     * @return the recargosnocturos
     */
    public double getRecargosnocturos() {
        return recargosnocturos;
    }

    /**
     * Modificar recargosnocturos.
     *
     * @param recargosnocturos the recargosnocturos
     */
    public void setRecargosnocturos(double recargosnocturos) {
        this.recargosnocturos = recargosnocturos;
    }

    /**
     * Obtener horasordinarias.
     *
     * @return the horasordinarias
     */
    public double getHorasordinarias() {
        return horasordinarias;
    }

    /**
     * Modificar horasordinarias.
     *
     * @param horasordinarias the horasordinarias
     */
    public void setHorasordinarias(double horasordinarias) {
        this.horasordinarias = horasordinarias;
    }

    /**
     * Obtener horas extras ordinarias.
     *
     * @return the horas extras ordinarias
     */
    public double getHorasExtrasOrdinarias() {
        return horasExtrasOrdinarias;
    }

    /**
     * Modificar horas extras ordinarias.
     *
     * @param horasExtrasOrdinarias the horas extras ordinarias
     */
    public void setHorasExtrasOrdinarias(double horasExtrasOrdinarias) {
        this.horasExtrasOrdinarias = horasExtrasOrdinarias;
    }

    /**
     * Obtener horas extras nocturnas.
     *
     * @return the horas extras nocturnas
     */
    public double getHorasExtrasNocturnas() {
        return horasExtrasNocturnas;
    }

    /**
     * Modificar horas extras nocturnas.
     *
     * @param horasExtrasNocturnas the horas extras nocturnas
     */
    public void setHorasExtrasNocturnas(double horasExtrasNocturnas) {
        this.horasExtrasNocturnas = horasExtrasNocturnas;
    }

    /**
     * Obtener horas extras ordinarias festivas.
     *
     * @return the horas extras ordinarias festivas
     */
    public double getHorasExtrasOrdinariasFestivas() {
        return horasExtrasOrdinariasFestivas;
    }

    /**
     * Modificar horas extras ordinarias festivas.
     *
     * @param horasExtrasOrdinariasFestivas the horas extras ordinarias festivas
     */
    public void setHorasExtrasOrdinariasFestivas(double horasExtrasOrdinariasFestivas) {
        this.horasExtrasOrdinariasFestivas = horasExtrasOrdinariasFestivas;
    }

    /**
     * Obtener horas extras nocturnas festivas.
     *
     * @return the horas extras nocturnas festivas
     */
    public double getHorasExtrasNocturnasFestivas() {
        return horasExtrasNocturnasFestivas;
    }

    /**
     * Modificar horas extras nocturnas festivas.
     *
     * @param horasExtrasNocturnasFestivas the horas extras nocturnas festivas
     */
    public void setHorasExtrasNocturnasFestivas(double horasExtrasNocturnasFestivas) {
        this.horasExtrasNocturnasFestivas = horasExtrasNocturnasFestivas;
    }

    /**
     * Obtener rn 1.
     *
     * @return the rn 1
     */
    public LocalTime getRn1() {
        return rn1;
    }

    /**
     * Obtener rn 2.
     *
     * @return the rn 2
     */
    public LocalTime getRn2() {
        return rn2;
    }

    /**
     * Obtener rn 3.
     *
     * @return the rn 3
     */
    public LocalTime getRn3() {
        return rn3;
    }

    /**
     * Obtener rn 4.
     *
     * @return the rn 4
     */
    public LocalTime getRn4() {
        return rn4;
    }

    /**
     * Obtener salario sin prestaciones.
     *
     * @return the salario sin prestaciones
     */
    public double getSalarioSinPrestaciones() {
        return salarioSinPrestaciones;
    }

    /**
     * Modificar salario sin prestaciones.
     *
     * @param salarioSinPrestaciones the salario sin prestaciones
     */
    public void setSalarioSinPrestaciones(double salarioSinPrestaciones) {
        this.salarioSinPrestaciones = salarioSinPrestaciones;
    }

    /**
     * Obtener salario con prestaciones.
     *
     * @return the salario con prestaciones
     */
    public double getSalarioConPrestaciones() {
        return salarioConPrestaciones;
    }

    /**
     * Modificar salario con prestaciones.
     *
     * @param salarioConPrestaciones the salario con prestaciones
     */
    public void setSalarioConPrestaciones(double salarioConPrestaciones) {
        this.salarioConPrestaciones = salarioConPrestaciones;
    }

    /**
     * Método Calcular horas.
     * Diseñado para el calculo de las horas trabajadas teniendo una
     * hora de entrada y una de salida.
     * @param horaEntrada la hora entrada
     * @param horaSalida  la hora salida
     * @param festivo     si es festivo o no festivo
     */
    public void calcularHoras(LocalTime horaEntrada, LocalTime horaSalida, boolean festivo ) {
        for (LocalTime i = horaEntrada; (i.isBefore(horaSalida)); i = i.plusMinutes(30)){
            if(festivo){
                if((i.equals(this.rn3)&&(this.horasExtrasNocturnasFestivas!=0)&&(this.horasExtrasOrdinariasFestivas!=0))){
                    break;
                }else {
                    if((i.isBefore(this.rn4)||i.equals(this.rn4))&&i.isAfter(this.rn3)){
                        this.horasExtrasNocturnasFestivas += 0.5;

                    }else if(i.isBefore(this.rn2) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.horasExtrasNocturnasFestivas += 0.5;

                    }else{
                        this.horasExtrasOrdinariasFestivas+=0.5;
                    }
                }
            }
            else{
                if((i.equals(this.rn3)&&(this.recargosnocturos!=0)&&(this.horasordinarias!=0))){
                    break;
                }else if((this.recargosnocturos+this.horasordinarias)<8){
                    if((i.isBefore(this.rn4)||i.equals(this.rn4))&&i.isAfter(this.rn3)){
                        this.recargosnocturos += 0.5;

                    }else if((i.isBefore(this.rn2)||i.equals(this.rn2)) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.recargosnocturos += 0.5;

                    }else{
                        this.horasordinarias+=0.5;
                    }
                }else{
                    if((i.isBefore(this.rn4))&&i.isAfter(this.rn3)){
                        this.horasExtrasNocturnas += 0.5;

                    }else if((i.isBefore(this.rn2)||i.equals(this.rn2)) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.horasExtrasNocturnas += 0.5;

                    }else{
                        this.horasExtrasOrdinarias+=0.5;
                    }

                }
            }

        }
    }

    /**
     * Método Calcular horas segundo registro.
     * Diseñado para el calculo de las horas trabajadas teniendo una
     * hora de entrada y una de salida y tomando en cuenta cuantas
     * horas se trabajaron en el registro anterior.
     * @param horaEntrada la hora entrada
     * @param horaSalida  la hora salida
     * @param festivo     si es festivo
     * @param registro    el registro anterior
     */
    public void calcularHorasSegundoRegistro(LocalTime horaEntrada, LocalTime horaSalida, boolean festivo, Registro registro){
        for (LocalTime i = horaEntrada; (i.isBefore(horaSalida)); i = i.plusMinutes(30)){
            if(festivo){
                if((i.equals(this.rn3)&&(this.horasExtrasNocturnasFestivas!=0)&&(this.horasExtrasOrdinariasFestivas!=0))){
                    break;
                }else {
                    if((i.isBefore(this.rn4)||i.equals(this.rn4))&&i.isAfter(this.rn3)){
                        this.horasExtrasNocturnasFestivas += 0.5;

                    }else if(i.isBefore(this.rn2) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.horasExtrasNocturnasFestivas += 0.5;

                    }else{
                        this.horasExtrasOrdinariasFestivas+=0.5;
                    }
                }
            }
            else{
                if((i.equals(this.rn3)&&(registro.getRecargo_nocturno()!=0)&&(registro.getHora_ordinaria()!=0))){
                    break;
                }else if((this.recargosnocturos+this.horasordinarias+registro.getRecargo_nocturno()+registro.getHora_ordinaria())<8){
                    if((i.isBefore(this.rn4) ||i.equals(this.rn4))&&i.isAfter(this.rn3)){
                        this.recargosnocturos += 0.5;

                    }else if((i.isBefore(this.rn2)||i.equals(this.rn2)) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.recargosnocturos += 0.5;

                    }else{
                        this.horasordinarias+=0.5;
                    }
                }else{
                    if((i.isBefore(this.rn4))&&i.isAfter(this.rn3)){
                        this.horasExtrasNocturnas += 0.5;

                    }else if((i.isBefore(this.rn2)||i.equals(this.rn2)) && (i.isAfter(this.rn1)||(i.equals(this.rn1)))){
                        this.horasExtrasNocturnas += 0.5;

                    }else{
                        this.horasExtrasOrdinarias+=0.5;
                    }
                }
            }

        }
    }

    /**
     * Método Calcular sueldo.
     * Diseñado para el calculo del pago extra en sobre el salario.
     * @param salario the salario
     */
    public void calcularSueldo(double salario){
        double salarioBaseHora;
        salarioBaseHora = salario/240;
        //salarioSinPrestaciones += horasordinarias*salarioBaseHora;
        salarioSinPrestaciones += recargosnocturos*salarioBaseHora*0.35;
        salarioSinPrestaciones += horasExtrasOrdinarias*salarioBaseHora*1.25;
        salarioSinPrestaciones += horasExtrasNocturnas*salarioBaseHora*1.75;
        salarioSinPrestaciones += horasExtrasOrdinariasFestivas*salarioBaseHora*2.00;
        salarioSinPrestaciones += horasExtrasNocturnasFestivas*salarioBaseHora*2.50;
        salarioConPrestaciones = salarioSinPrestaciones*prestaciones;

    }
}
