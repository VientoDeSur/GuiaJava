package GuiaJava.Guia2.Ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por
 * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
 * investigar la función Math.sqrt().
 */
public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Escribe un numero: ");
        num = leer.nextInt();
        System.out.println("El doble es: " + (num * 2));
        System.out.println("El triple es: " + (num * 3));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));

    }
}
