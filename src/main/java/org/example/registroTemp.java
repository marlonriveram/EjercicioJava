package org.example;

import java.util.Scanner;

public class registroTemp {
    public static void main(String[] args) {
        /*Registro de Temperatura: Diseñe un programa que calcule el promedio
        de temperaturas ingresadas por un usuario. El usuario debe ingresar 5
        temperaturas y el programa debe mostrar el promedio.*/

        Scanner lectorTeclado = new Scanner(System.in);

        float temperuatura;
        float contador = 0f;

        System.out.println("Registro de Temperaturas ");
        System.out.println("Debes ingresar 5 Temperaturas");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite la temperatura Numero " + i + ":");
            temperuatura = lectorTeclado.nextFloat();
            contador += temperuatura;
        }
        String temPromedio= String.format("%.3f",contador/5);
        System.out.print("La temperatura Promedio es : " + temPromedio);
    }
}



