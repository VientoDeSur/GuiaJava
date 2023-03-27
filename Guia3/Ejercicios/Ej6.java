package Guia3.Ejercicios;

import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;
/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
public class Ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        String letra = " ";
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija la opcion: ");
        opcion = leer.nextInt();
        do {
        switch(opcion){
            case 1:
                System.out.println("La suma de los 2 numeros es de: " + (num1+num2));
                continue;
            case 2:
                System.out.println("La resta de los 2 numeros es de: " + (num1-num2));
                continue;
            case 3:
                System.out.println("La multiplicacion de los 2 numeros es de: " + (num1*num2));
                continue;
            case 4:
                System.out.println("La division de los 2 numeros es de: " + (num1/num2));
                continue;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                letra = leer.nextLine();
                if (letra.equalsIgnoreCase("s")) {
                    break;
                }else if (letra.equalsIgnoreCase("n")) {
                }
        }
        } while ("n".equalsIgnoreCase(letra));
        
        

}
}