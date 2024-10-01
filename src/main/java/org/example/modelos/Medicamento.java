package org.example.modelos;

import java.util.Date;

public class Medicamento {
    private String nombre;
    private String principioActivo;
    private String formaFarmaceutica;
    private String dosis;
    private String viaAdministracion;
    private String indicaciones;
    private String contraindicaciones;
    private String efectosSecundarios;
    private Date fechaExpiracion;
    private String laboratorioFabricante;

    public Medicamento() {
    }

    public Medicamento(String nombre, String principioActivo, String formaFarmaceutica, String dosis, String viaAdministracion, String indicaciones, String contraindicaciones, String efectosSecundarios, Date fechaExpiracion, String laboratorioFabricante) {
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.viaAdministracion = viaAdministracion;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
        this.efectosSecundarios = efectosSecundarios;
        this.fechaExpiracion = fechaExpiracion;
        this.laboratorioFabricante = laboratorioFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getLaboratorioFabricante() {
        return laboratorioFabricante;
    }

    public void setLaboratorioFabricante(String laboratorioFabricante) {
        this.laboratorioFabricante = laboratorioFabricante;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", dosis='" + dosis + '\'' +
                ", viaAdministracion='" + viaAdministracion + '\'' +
                ", indicaciones='" + indicaciones + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                ", efectosSecundarios='" + efectosSecundarios + '\'' +
                ", fechaExpiracion=" + fechaExpiracion +
                ", laboratorioFabricante='" + laboratorioFabricante + '\'' +
                '}';
    }
}
