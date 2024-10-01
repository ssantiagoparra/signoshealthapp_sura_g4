package org.example.modelos;

public class Enfermedad {
    private String nombre;
    private String tipo; // Ejemplo: viral, bacteriana, genética
    private String sintomas;
    private String causa;
    private String tratamiento;
    private boolean esContagiosa;
    private String periodoIncubacion; // Ejemplo: "2-14 días"
    private double tasaMortalidad; // Porcentaje de mortalidad
    private String grupoRiesgo; // Ejemplo: niños, ancianos, inmunodeprimidos
    private String fechaDescubrimiento;

    public Enfermedad() {
    }

    public Enfermedad(String nombre, String tipo, String sintomas, String causa, String tratamiento, boolean esContagiosa, String periodoIncubacion, double tasaMortalidad, String grupoRiesgo, String fechaDescubrimiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sintomas = sintomas;
        this.causa = causa;
        this.tratamiento = tratamiento;
        this.esContagiosa = esContagiosa;
        this.periodoIncubacion = periodoIncubacion;
        this.tasaMortalidad = tasaMortalidad;
        this.grupoRiesgo = grupoRiesgo;
        this.fechaDescubrimiento = fechaDescubrimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean isEsContagiosa() {
        return esContagiosa;
    }

    public void setEsContagiosa(boolean esContagiosa) {
        this.esContagiosa = esContagiosa;
    }

    public String getPeriodoIncubacion() {
        return periodoIncubacion;
    }

    public void setPeriodoIncubacion(String periodoIncubacion) {
        this.periodoIncubacion = periodoIncubacion;
    }

    public double getTasaMortalidad() {
        return tasaMortalidad;
    }

    public void setTasaMortalidad(double tasaMortalidad) {
        this.tasaMortalidad = tasaMortalidad;
    }

    public String getGrupoRiesgo() {
        return grupoRiesgo;
    }

    public void setGrupoRiesgo(String grupoRiesgo) {
        this.grupoRiesgo = grupoRiesgo;
    }

    public String getFechaDescubrimiento() {
        return fechaDescubrimiento;
    }

    public void setFechaDescubrimiento(String fechaDescubrimiento) {
        this.fechaDescubrimiento = fechaDescubrimiento;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", causa='" + causa + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", esContagiosa=" + esContagiosa +
                ", periodoIncubacion='" + periodoIncubacion + '\'' +
                ", tasaMortalidad=" + tasaMortalidad +
                ", grupoRiesgo='" + grupoRiesgo + '\'' +
                ", fechaDescubrimiento='" + fechaDescubrimiento + '\'' +
                '}';
    }
}
