/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

public class Ej6Gpt2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String letra = " ";

        // Limpiar la consola
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception ex) {
        }

        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();

        // Limpiar la consola
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception ex) {
        }

        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija la opcion: ");
        opcion = leer.nextInt();

        do {
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los 2 numeros es de: " + (num1 + num2));
                    continue;
                case 2:
                    System.out.println("La resta de los 2 numeros es de: " + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion de los 2 numeros es de: " + (num1 * num2));
                    continue;
                case 4:
                    System.out.println("La division de los 2 numeros es de: " + (num1 / num2));
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letra = leer.next();
                    if (letra.equalsIgnoreCase("s")) {
                        break;
                    } else if (letra.equalsIgnoreCase("n")) {
                        continue;
                    }
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                    continue;
            }
        } while (!letra.equalsIgnoreCase("s"));
    }
}
