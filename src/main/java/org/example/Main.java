package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Calculadora de Intereses: Diseñe un programa en Java que calcule el
            interés simple de un préstamo. El usuario debe ingresar el capital inicial,
            la tasa de interés anual y el número de años. El programa debe mostrar
            el interés ganado y el total al final del periodo.
         */
        Scanner lectorTeclado = new Scanner(System.in);
        double capitalInicial;
        double interesAnual;
        int numAnios;

        System.out.print("Ingrese su Capital Inicial :");
        capitalInicial = lectorTeclado.nextDouble();

        System.out.print("Ingrese el Interes Anual :");
        interesAnual = lectorTeclado.nextDouble()/100;

        System.out.print("Ingrese el numero de Años :");
        numAnios = lectorTeclado.nextInt();

        // INTERES GANADO

        double interesGanado = capitalInicial*interesAnual*numAnios;

        double totalFinPeriodo = capitalInicial + interesGanado;

        String interesGanadoRedondeado = String.format("%.0f",interesGanado);
        String totalPeriodoRedondeado = String.format("%.0f",totalFinPeriodo );
        System.out.println(" \n\nEl interes Ganado es " + interesGanadoRedondeado+ " Su total al final del periodo fue: " + totalPeriodoRedondeado);

    }
}