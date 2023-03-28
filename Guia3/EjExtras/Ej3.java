package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class Ej3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra;

        System.out.println("Ingrese una letra: ");
        letra = leer.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }

    }
}
