package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
public class Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Ingrese una frase:");
            frase = leer.nextLine();
            if (frase.equalsIgnoreCase("eureka")) {
                System.out.println("Correcto.");
            } else {
                System.out.println("Incorrecto.");
            }
        } while (!"eureka".equalsIgnoreCase(frase));

    }

}
