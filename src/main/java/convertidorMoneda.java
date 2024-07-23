import java.util.Scanner;

public class convertidorMoneda {
    public static void main(String[] args) {

        /*
         Conversor de Moneda: Cree un programa en Java que convierta pesos
         colombianos a dólares y viceversa. El usuario debe ingresar el monto y
         seleccionar la operación (COP a USD o USD a COP). Utilice una tasa de
         cambio fija para las conversiones.
         */
        Scanner lectorTeclado = new Scanner(System.in);

        int operacion;
        double monto;
        double conversion;
        double usaAcop = 4012.50;
        double copAusa = 0.00025;
        System.out.println("Seleccione la Operacion a Realizar");
        System.out.println("1- Converitir COP a USA");
        System.out.println("2- Converitir USA a COP");

        operacion = lectorTeclado.nextInt();

        if(operacion == 1){
            System.out.println("Has Seleccionado la Operacio 1- Covertir COP a USA ");

            System.out.print("Ahora Digita el Monto a Convertir: ");
            monto = lectorTeclado.nextInt();
            conversion = monto* copAusa;
            String conversionRedondeo= String.format("%.3f",conversion);
            System.out.println("\n"+ monto + " Equivale a " + conversionRedondeo + " Dolares");
        } else {
            System.out.println("Has Seleccionado la Operacio 2- Covertir USA a COP ");

            System.out.print("Ahora Digita el Monto a Convertir: ");
            monto = lectorTeclado.nextInt();
            conversion = monto* usaAcop;
            String conversionRedondeo= String.format("%.3f",conversion);
            System.out.println("\n"+ monto + " Equivale a " + conversionRedondeo + " Pesos Colombianos");
        }
    }
}
