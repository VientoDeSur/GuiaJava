package Guia3.EjExtras;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
*/

public class Ej7_doWhile {
    public static void main(String[] args) {
           
        Scanner leer = new Scanner(System.in);
        int cant, num, cont = 0, valMax = Integer.MIN_VALUE, valMin = Integer.MAX_VALUE;
        double suma = 0;
        
        System.out.println("Ingrese la cantidad de numeros a calcular: ");
            cant = leer.nextInt();
            
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num > valMax) {
                valMax = num;
            }
            if (num < valMin) {
                valMin = num;
            }
            cont = cont + 1;
            suma += num;
            
        } while (cant > cont);
        
        System.out.println("El promedio de los numeros es de " + (suma/cant) );
        System.out.println("El valor maximo ingresado es de: " + valMax );
        System.out.println("El valor minimo ingresado es de: " + valMin );
    }
    
}
