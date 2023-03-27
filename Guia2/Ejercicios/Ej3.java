
package Guia2.Ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pida una frase 
 * y la muestre toda en mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Escriba una frase: ");
        frase = leer.nextLine();
        System.out.println("La frase en mayusculas es: "+ frase.toUpperCase()) ;
        System.out.println("La frase en mayusculas es: "+ frase.toLowerCase()) ;        
    }
}
