package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class contadorDias {
    public static void main(String[] args) {
        /*Contador de Días: Cree un programa que calcule cuántos días hay entre
          dos fechas. El usuario debe ingresar dos fechas (día, mes, año) y el
          programa debe mostrar el número de días entre ellas.*/

        Scanner lectorTeclado = new Scanner(System.in);

        LocalDate fechaIni;
        LocalDate fechaFin;
        int dia1;
        int dia2;
        int mes1;
        int mes2;
        int anio1;
        int anio2;


        System.out.println("Comparador de Fechas");
        System.out.println("************************");
        System.out.println("Digite la Fecha Inicio");

        System.out.print("Día: ");
        dia1 = lectorTeclado.nextInt();

        System.out.print("Mes: ");
        mes1 = lectorTeclado.nextInt();

        System.out.print("Año: ");
        anio1 = lectorTeclado.nextInt();
        System.out.println("************************");

        System.out.print("Digite la Fecha Fin");

        System.out.print("Día: ");
        dia2 = lectorTeclado.nextInt();

        System.out.print("Mes: ");
        mes2 = lectorTeclado.nextInt();

        System.out.print("Año: ");
        anio2 = lectorTeclado.nextInt();
        System.out.println("************************");

        fechaIni = LocalDate.of(anio1,mes1,dia1);
        fechaFin = LocalDate.of(anio2,mes2,dia2);

        long numeroDias = ChronoUnit.DAYS.between(fechaIni,fechaFin);

        System.out.println("El numero de Días entre " + fechaIni + " y " + fechaFin + " son : " + numeroDias);

    }


}
