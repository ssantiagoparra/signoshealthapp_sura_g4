package org.example.modelos;

public class Paciente {

        private String nombre;
        private String apellido;
        private String genero;
        private String fechaNacimiento;
        private String direccion;
        private String telefono;
        private String email;
        private String numeroSeguroSocial;
        private String tipoSangre;
        private double altura; // en metros
        private double peso; // en kilogramos
        private String alergias;
        private String enfermedadesPrevias;
        private String medicoAsignado;
        private boolean seguroMedico; // Indica si el paciente tiene seguro médico

        public Paciente() {
        }

        public Paciente(String nombre, String apellido, String genero, String fechaNacimiento, String direccion, String telefono, String email, String numeroSeguroSocial, String tipoSangre, double altura, double peso, String alergias, String enfermedadesPrevias, String medicoAsignado, boolean seguroMedico) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.genero = genero;
                this.fechaNacimiento = fechaNacimiento;
                this.direccion = direccion;
                this.telefono = telefono;
                this.email = email;
                this.numeroSeguroSocial = numeroSeguroSocial;
                this.tipoSangre = tipoSangre;
                this.altura = altura;
                this.peso = peso;
                this.alergias = alergias;
                this.enfermedadesPrevias = enfermedadesPrevias;
                this.medicoAsignado = medicoAsignado;
                this.seguroMedico = seguroMedico;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public String getFechaNacimiento() {
                return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public String getTelefono() {
                return telefono;
        }

        public void setTelefono(String telefono) {
                this.telefono = telefono;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getNumeroSeguroSocial() {
                return numeroSeguroSocial;
        }

        public void setNumeroSeguroSocial(String numeroSeguroSocial) {
                this.numeroSeguroSocial = numeroSeguroSocial;
        }

        public String getTipoSangre() {
                return tipoSangre;
        }

        public void setTipoSangre(String tipoSangre) {
                this.tipoSangre = tipoSangre;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public String getAlergias() {
                return alergias;
        }

        public void setAlergias(String alergias) {
                this.alergias = alergias;
        }

        public String getEnfermedadesPrevias() {
                return enfermedadesPrevias;
        }

        public void setEnfermedadesPrevias(String enfermedadesPrevias) {
                this.enfermedadesPrevias = enfermedadesPrevias;
        }

        public String getMedicoAsignado() {
                return medicoAsignado;
        }

        public void setMedicoAsignado(String medicoAsignado) {
                this.medicoAsignado = medicoAsignado;
        }

        public boolean isSeguroMedico() {
                return seguroMedico;
        }

        public void setSeguroMedico(boolean seguroMedico) {
                this.seguroMedico = seguroMedico;
        }

        @Override
        public String toString() {
                return "Paciente{" +
                        "nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", genero='" + genero + '\'' +
                        ", fechaNacimiento='" + fechaNacimiento + '\'' +
                        ", direccion='" + direccion + '\'' +
                        ", telefono='" + telefono + '\'' +
                        ", email='" + email + '\'' +
                        ", numeroSeguroSocial='" + numeroSeguroSocial + '\'' +
                        ", tipoSangre='" + tipoSangre + '\'' +
                        ", altura=" + altura +
                        ", peso=" + peso +
                        ", alergias='" + alergias + '\'' +
                        ", enfermedadesPrevias='" + enfermedadesPrevias + '\'' +
                        ", medicoAsignado='" + medicoAsignado + '\'' +
                        ", seguroMedico=" + seguroMedico +
                        '}';
        }
}


