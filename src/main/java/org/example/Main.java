package org.example;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Algoritmo para un pequeño estudio de desarrollo de videojuegos llamado IndieDreams,
        //Se esta está planificando el presupuesto de su próximo videojuego indie

        //Datos de entrada

        DecimalFormat decimalFormat = new DecimalFormat("$");
        Scanner scanner = new Scanner(System.in);
        String nombreVideojuego;
        String primerNombreJefeProyecto;
        String primerApellidoJefeProyecto;
        String plataformaPrincipalVideojuego;
        String motorDesarrollo;
        int nroHorasDesarrolloTotal;
        float costoHora;
        float valorLicencias;
        float gastosTotalesAdicionales;
        float honorariosAdministrativos = (float) 0.05;
        float imprevistos = (float) 0.10;
        float costoTotalHoras;
        float subtotalInicial;
        float costoTotalGeneral;



        //Ingreso de informacion

        System.out.print("\nIngrese el nombre del videojuego: ");
        nombreVideojuego = scanner.next();
        System.out.print("\nIngrese el primer nombre del jefe del proyecto: ");
        primerNombreJefeProyecto = scanner.next();
        System.out.print("\nIngrese el primer apellido del jefe del prpyecto: ");
        primerApellidoJefeProyecto = scanner.next();
        System.out.print("\nIngrese el nombre de la plataforma principal del videojuego: ");
        plataformaPrincipalVideojuego = scanner.next();
        System.out.print("\nIngrese el nombre del motor de desarrollo del proyecto: ");
        motorDesarrollo = scanner.next();
        System.out.print("\nIngrese el total de horas que se dedicara al proyecto: ");
        nroHorasDesarrolloTotal = scanner.nextInt();
        System.out.print("\nIngrese el valor de la hora del proyecto: ");
        costoHora = scanner.nextFloat();;
        System.out.print("\nIngrese el valor de las licencias de software: ");
        valorLicencias = scanner.nextFloat();
        System.out.print("\nSume el total de los gastos adicionales como publicidad, musica, diseño grafico etc...: ");
        gastosTotalesAdicionales = scanner.nextFloat();

        // Obtener la fecha y hora actual del sistema
        LocalDateTime fechaRegistro = LocalDateTime.now();

        //Hora y fecha personalizada

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Proceso

        costoTotalHoras = nroHorasDesarrolloTotal * costoHora;
        subtotalInicial = costoTotalHoras + valorLicencias + gastosTotalesAdicionales;
        costoTotalGeneral = subtotalInicial + imprevistos + honorariosAdministrativos;


        //Datos de salida

        System.out.print("\nNombre del videojuego: " + nombreVideojuego);
        System.out.print("\nNombre del jefe del proyecto: " + primerNombreJefeProyecto + primerApellidoJefeProyecto);
        System.out.print("\nNombre de la plataforma y motor de desarrollo: " + plataformaPrincipalVideojuego + motorDesarrollo);
        System.out.print("\nEl costo total correspondiente a las horas totales del proyecto: " + costoTotalHoras);
        System.out.print("\nSubtotal: " + subtotalInicial);
        System.out.print("\nValor de honorarios administrativos: " + honorariosAdministrativos);
        System.out.print("\nValor de imprevistos: " + imprevistos);
        System.out.print("\nCosto Total General: " + costoTotalGeneral);
        System.out.println("\n✅ Fecha de registro: " + fechaRegistro.format(formato));
    }
}