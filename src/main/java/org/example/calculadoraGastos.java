package org.example;

import java.util.Scanner;

public class calculadoraGastos {
    public static void main(String[] args) {
        /*Calculadora de Gastos de Viaje: Desarrolle un programa que calcule el
          costo total de un viaje. El usuario debe ingresar el número de kilómetros
          a recorrer, el costo por kilómetro y otros gastos adicionales. El programa
          debe mostrar el costo total.*/

        Scanner lectorTeclado = new Scanner(System.in);

        float costoTotal;
        float numKilometros;
        float costoKilometro;
        float comida;
        float hospedaje;

        System.out.println("Calculadora de Gastos");

        System.out.print("Ingrese el Numero de Kilometros :");
        numKilometros = lectorTeclado.nextFloat();

        System.out.print("Ingrese el costo de Valor por Kilometro : ");
        costoKilometro = lectorTeclado.nextFloat();


        System.out.print("Ingrese el costo de La comida : ");
        comida = lectorTeclado.nextFloat();


        System.out.print("Ingrese el costo del Hopedaja : ");
        hospedaje = lectorTeclado.nextFloat();

        costoTotal = (numKilometros * costoKilometro) + comida + hospedaje;

        System.out.print("El costo Total es de : " + costoTotal);

    }
}
