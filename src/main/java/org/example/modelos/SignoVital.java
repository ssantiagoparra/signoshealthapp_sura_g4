package org.example.modelos;

import java.util.Date;

public class SignoVital {
    private double frecuenciaCardiaca;
    private double presionArterialSistolica;
    private double presionArterialDiastolica;
    private double frecuenciaRespiratoria;
    private double temperaturaCorporal;
    private double saturacionOxigeno;
    private double nivelGlucosa;
    private String estadoConsciente;
    private Date fechaMedicion;
    private String observaciones;

    public SignoVital() {
    }

    public SignoVital(double frecuenciaCardiaca, double presionArterialSistolica, double presionArterialDiastolica, double frecuenciaRespiratoria, double temperaturaCorporal, double saturacionOxigeno, double nivelGlucosa, String estadoConsciente, Date fechaMedicion, String observaciones) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionArterialSistolica = presionArterialSistolica;
        this.presionArterialDiastolica = presionArterialDiastolica;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.saturacionOxigeno = saturacionOxigeno;
        this.nivelGlucosa = nivelGlucosa;
        this.estadoConsciente = estadoConsciente;
        this.fechaMedicion = fechaMedicion;
        this.observaciones = observaciones;
    }

    public double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public double getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(double presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public double getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(double presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }

    public double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(double saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public double getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(double nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public String getEstadoConsciente() {
        return estadoConsciente;
    }

    public void setEstadoConsciente(String estadoConsciente) {
        this.estadoConsciente = estadoConsciente;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", presionArterialSistolica=" + presionArterialSistolica +
                ", presionArterialDiastolica=" + presionArterialDiastolica +
                ", frecuenciaRespiratoria=" + frecuenciaRespiratoria +
                ", temperaturaCorporal=" + temperaturaCorporal +
                ", saturacionOxigeno=" + saturacionOxigeno +
                ", nivelGlucosa=" + nivelGlucosa +
                ", estadoConsciente='" + estadoConsciente + '\'' +
                ", fechaMedicion=" + fechaMedicion +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
