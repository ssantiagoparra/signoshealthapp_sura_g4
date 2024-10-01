package org.example;
import org.example.modelos.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear y llenar Enfermedad
        Enfermedad enfermedad = new Enfermedad();
        System.out.println("Ingrese los detalles de la Enfermedad:");
        System.out.print("Nombre: ");
        enfermedad.setNombre(scanner.nextLine());
        System.out.print("Tipo: ");
        enfermedad.setTipo(scanner.nextLine());
        System.out.print("Síntomas: ");
        enfermedad.setSintomas(scanner.nextLine());
        System.out.print("Causa: ");
        enfermedad.setCausa(scanner.nextLine());
        System.out.print("Tratamiento: ");
        enfermedad.setTratamiento(scanner.nextLine());
        System.out.print("¿Es contagiosa? (true/false): ");
        enfermedad.setEsContagiosa(scanner.nextBoolean());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Período de incubación: ");
        enfermedad.setPeriodoIncubacion(scanner.nextLine());
        System.out.print("Tasa de mortalidad: ");
        enfermedad.setTasaMortalidad(scanner.nextDouble());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Grupo de riesgo: ");
        enfermedad.setGrupoRiesgo(scanner.nextLine());
        System.out.print("Fecha de descubrimiento: ");
        enfermedad.setFechaDescubrimiento(scanner.nextLine());

        // Crear y llenar Medicamento
        Medicamento medicamento = new Medicamento();
        System.out.println("\nIngrese los detalles del Medicamento:");
        System.out.print("Nombre: ");
        medicamento.setNombre(scanner.nextLine());
        System.out.print("Principio activo: ");
        medicamento.setPrincipioActivo(scanner.nextLine());
        System.out.print("Forma farmacéutica: ");
        medicamento.setFormaFarmaceutica(scanner.nextLine());
        System.out.print("Dosis: ");
        medicamento.setDosis(scanner.nextLine());
        System.out.print("Vía de administración: ");
        medicamento.setViaAdministracion(scanner.nextLine());
        System.out.print("Indicaciones: ");
        medicamento.setIndicaciones(scanner.nextLine());
        System.out.print("Contraindicaciones: ");
        medicamento.setContraindicaciones(scanner.nextLine());
        System.out.print("Efectos secundarios: ");
        medicamento.setEfectosSecundarios(scanner.nextLine());
        System.out.print("Fecha de expiración (yyyy-MM-dd): ");
        medicamento.setFechaExpiracion(java.sql.Date.valueOf(scanner.nextLine())); // Asumiendo que el formato es yyyy-MM-dd
        System.out.print("Laboratorio fabricante: ");
        medicamento.setLaboratorioFabricante(scanner.nextLine());

        // Crear y llenar SignoVital
        SignoVital signoVital = new SignoVital();
        System.out.println("\nIngrese los detalles del Signo Vital:");
        System.out.print("Frecuencia cardíaca: ");
        signoVital.setFrecuenciaCardiaca(scanner.nextDouble());
        System.out.print("Presión arterial sistólica: ");
        signoVital.setPresionArterialSistolica(scanner.nextDouble());
        System.out.print("Presión arterial diastólica: ");
        signoVital.setPresionArterialDiastolica(scanner.nextDouble());
        System.out.print("Frecuencia respiratoria: ");
        signoVital.setFrecuenciaRespiratoria(scanner.nextDouble());
        System.out.print("Temperatura corporal: ");
        signoVital.setTemperaturaCorporal(scanner.nextDouble());
        System.out.print("Saturación de oxígeno: ");
        signoVital.setSaturacionOxigeno(scanner.nextDouble());
        System.out.print("Nivel de glucosa: ");
        signoVital.setNivelGlucosa(scanner.nextDouble());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Estado consciente: ");
        signoVital.setEstadoConsciente(scanner.nextLine());
        System.out.print("Fecha de medición (yyyy-MM-dd): ");
        signoVital.setFechaMedicion(java.sql.Date.valueOf(scanner.nextLine())); // Asumiendo que el formato es yyyy-MM-dd
        System.out.print("Observaciones: ");
        signoVital.setObservaciones(scanner.nextLine());

        // Crear y llenar Paciente
        Paciente paciente = new Paciente();
        System.out.println("Ingrese los detalles del Paciente:");
        System.out.print("Nombre: ");
        paciente.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        paciente.setApellido(scanner.nextLine());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Dirección: ");
        paciente.setDireccion(scanner.nextLine());
        System.out.print("Teléfono: ");
        paciente.setTelefono(scanner.nextLine());
        System.out.print("Email: ");
        paciente.setEmail(scanner.nextLine());
        System.out.print("Numero Seguro Social: ");
        paciente.setNumeroSeguroSocial(scanner.nextLine());
        System.out.print("Alergias: ");
        paciente.setAlergias(scanner.nextLine());

        // Mostrar los datos ingresados
        System.out.println("Detalles de la Enfermedad: " + enfermedad);
        System.out.println("Detalles del Medicamento: " + medicamento);
        System.out.println("Detalles del Signo Vital: " + signoVital);
        System.out.println("Detalles del Paciente: " + paciente);


        // Constructor vacío
        Paciente pacienteUno = new Paciente();

        // Constructor lleno
        Paciente pacienteDos = new Paciente(
                "Juan",
                "Pérez",
                "Masculino",
                "1990-01-01",
                "Calle Falsa 123",
                "123456789",
                "juan.perez@example.com",
                "123-45-6789",
                "O+",
                1.75,
                70.0,
                "Ninguna",
                "Ninguna",
                "Dr. Smith",
                true
        );

        // Imprimir detalles de los pacientes
        System.out.println(pacienteUno);
        System.out.println(pacienteDos);

        // Constructor vacío
        Medico medicoUno = new Medico();

        // Constructor lleno
        Medico medicoDos = new Medico(
                "Ana",
                "García",
                "Pediatría",
                "LIC12345",
                "987654321",
                "ana.garcia@example.com",
                "Avenida Siempre Viva 742",
                "Hospital General",
                10,
                "Lunes a Viernes 9am - 5pm",
                3000.00,
                "Femenino",
                "1985-05-15",
                "Colombiana",
                true
        );

        // Imprimir detalles de los médicos
        System.out.println(medicoUno);
        System.out.println(medicoDos);


        // Constructor vacío
        Enfermedad enfermedadUno = new Enfermedad();

        // Constructor lleno
        Enfermedad enfermedadDos = new Enfermedad(
                "COVID-19",
                "Viral",
                "Fiebre, tos, dificultad para respirar",
                "Virus SARS-CoV-2",
                "Reposo, medicamentos para aliviar síntomas",
                true,
                "2-14 días",
                2.0, // Tasa de mortalidad en porcentaje
                "Ancianos, personas con comorbilidades",
                "2019-12-31"
        );

        // Imprimir detalles de las enfermedades
        System.out.println(enfermedadUno);
        System.out.println(enfermedadDos);


        // Constructor vacío
        Medicamento medicamentoUno = new Medicamento();

        // Crear una fecha de expiración (puedes cambiarla según lo necesites)
        Date fechaExpiracion = new Date(2025 - 1900, 11 - 1, 30); // 30 de noviembre de 2025

        // Constructor lleno
        Medicamento medicamentoDos = new Medicamento(
                "Paracetamol",
                "Paracetamol",
                "Tableta",
                "500 mg",
                "Oral",
                "Alivio del dolor, reducción de fiebre",
                "Hipersensibilidad al paracetamol",
                "Náuseas, erupción cutánea",
                fechaExpiracion,
                "Laboratorios XYZ"
        );

        // Imprimir detalles de los medicamentos
        System.out.println(medicamentoUno);
        System.out.println(medicamentoDos);

        // Constructor vacío
        SignoVital signoVitalUno = new SignoVital();

        // Crear una fecha de medición (puedes cambiarla según lo necesites)
        Date fechaMedicion = new Date(); // Fecha actual

        // Constructor lleno
        SignoVital signoVitalDos = new SignoVital(
                75.0, // Frecuencia cardíaca
                120.0, // Presión arterial sistólica
                80.0, // Presión arterial diastólica
                16.0, // Frecuencia respiratoria
                36.5, // Temperatura corporal
                98.0, // Saturación de oxígeno
                90.0, // Nivel de glucosa
                "Alerta", // Estado consciente
                fechaMedicion, // Fecha de medición
                "Sin observaciones" // Observaciones
        );

        // Imprimir detalles de los signos vitales
        System.out.println(signoVitalUno);
        System.out.println(signoVitalDos);
    }
}


