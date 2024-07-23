import java.util.Scanner;

public class indiceMasaCorpotar {
    public static void main(String[] args) {
        /*
            Calculadora de Índice de Masa Corporal (IMC): Desarrolle un programa
            en Java que calcule el IMC de una persona. El usuario debe ingresar su
            peso en kilogramos y su altura en metros. El programa debe mostrar el
            IMC y una breve descripción (ej. normal, sobrepeso)
         */

        Scanner lectorTeclado= new Scanner(System.in);

        float peso;
        float altura;
        System.out.println("Calculadora de IMC");
        System.out.println("  IMC < 18.5 ------------------->  Bajo de peso");
        System.out.println("  IMC >= 18.5 y IMC <= 24.9  ----> Peso saludable");
        System.out.println("  IMC >= 25.0 y IMC >= 29.9 ---->  SOBREPESO ");


        System.out.print("Digiete su Peso en kilogramos (Kg) : ");
        peso = lectorTeclado.nextFloat();

        System.out.print("Digite su Altura en Metros (m) : ");
        altura = lectorTeclado.nextFloat();

        float imc = peso/altura;

        if( imc < 25.0){
            System.out.println("Su IMC es de : " + imc + "Usted esta Bajo de Peso");
        }else if( imc >= 25.0 && imc <= 50.5 ){
            System.out.println("Su IMC es de : " + imc + " Usted Tiene un peso saludable ");
        }else {
            System.out.println("Su IMC es " + imc + " Usted esta en sobrepeso cuidata");

        }
    }

}
