package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.

*/
public class Ej5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String socio;
        int trat;
        do {
            System.out.println("Ingrese la categoria del socio: ");
            socio = leer.nextLine();
            socio = socio.toLowerCase();
            System.out.println("Ingrese el monto a pagar por el medicamento: ");
            trat = leer.nextInt();
            switch (socio){
                case "a":
                    System.out.println("El valor total del tratamiento con el descuento es de: " + (trat*0.5));
                    break;
                case "b":
                    System.out.println("El valor total del tratamiento con el descuento es de: " + (trat*0.65));
                    break;
                case "c":
                    System.out.println("El socio no recibe descuentos en medicamentos.");
                    break;
                default:   
                    System.out.println("La letra ingresada no corresponde a una categoria de socio.");
                    break;       
            }
                  leer.nextLine();
            
        } while (!socio.equalsIgnoreCase("a") && !socio.equalsIgnoreCase("b") && !socio.equalsIgnoreCase("c") );
        
        
    }
    
}
