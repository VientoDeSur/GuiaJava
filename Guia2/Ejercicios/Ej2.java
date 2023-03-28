package GuiaJava.Guia2.Ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
 * muestre por pantalla.
 *
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Escriba su nombre: ");
        nombre = leer.nextLine();
        System.out.println(nombre);

    }

}
