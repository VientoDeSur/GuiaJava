package Guia3.Ejercicios;

import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
*/
public class Ej4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase que empiece con la letra A: ");
        frase = leer.nextLine();
                
        while (!"a".equalsIgnoreCase(frase.substring(0,1))) {
            System.out.println("INCORRECTO");
            System.out.println("Ingrese nuevamente la frase: ");
            frase = leer.nextLine();
        }
        
        System.out.println("CORRRECTO");
    }
    
}
