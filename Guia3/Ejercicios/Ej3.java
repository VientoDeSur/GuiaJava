package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
public class Ej3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
        int lon;

        do {
            System.out.println("Ingrese frase: ");
            frase = leer.nextLine();
            lon = frase.length();
            if (lon == 8) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        } while (lon != 8);
    }
}
