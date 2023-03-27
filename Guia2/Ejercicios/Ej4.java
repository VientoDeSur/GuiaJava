package GuiaJava.Guia2.Ejercicios;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar 
 * su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grados;
        System.out.println("Escriba los grados celcius para ser convertidos a fahrenheit: ");
        grados = leer.nextInt();
        System.out.println("En fahrenheit es: " + (32 + (9 * grados / 5)) );
                
        
    }
}
