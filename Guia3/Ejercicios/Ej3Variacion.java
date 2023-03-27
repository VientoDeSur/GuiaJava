package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
*/
public class Ej3Variacion {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        int lon;
        
        System.out.println("Ingrese una frase de 8 letras: ");
        frase = leer.nextLine();
        lon = frase.length();
        
        while (lon != 8) {
            System.out.println("INCORRECTO");
            System.out.println("Ingrese nuevamente la frase: ");
            frase = leer.nextLine();
            lon = frase.length();
            
        }
        
        System.out.println("CORRRECTO");
        
        
        
    }
    
}
