package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

public class Ej5MejGpt {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String socio;
        double trat;

        do {
            System.out.println("Ingrese la categoria del socio (a, b o c): ");
            socio = leer.nextLine().toLowerCase();
            System.out.println("Ingrese el monto a pagar por el medicamento: ");
            trat = leer.nextDouble();

            switch (socio) {
                case "a":
                    System.out.println("El valor total del tratamiento con el descuento es de: " + (trat * 0.5));
                    break;
                case "b":
                    System.out.println("El valor total del tratamiento con el descuento es de: " + (trat * 0.65));
                    break;
                case "c":
                    System.out.println("El socio no recibe descuentos en medicamentos.");
                    break;
                default:
                    System.out.println("La letra ingresada no corresponde a una categoria de socio.");
                    break;
            }

            leer.nextLine(); // Consumir el salto de línea después de leer el valor trat

        } while (!socio.equals("a") && !socio.equals("b") && !socio.equals("c"));

        leer.close(); // Cerrar el Scanner al final del programa

    }

}
