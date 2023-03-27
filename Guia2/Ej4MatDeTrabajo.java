/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/*Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.
*/
public class Ej4MatDeTrabajo {
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    String nombre;
    int edad;
    System.out.println("Ingrese su Nombre: ");
    nombre = leer.next();
    System.out.println("Ingrese su Edad: ");
    edad = leer.nextInt();
    System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " años.");        
    
    
    
}
}
