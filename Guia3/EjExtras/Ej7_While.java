package Guia3.EjExtras;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.

*/
public class Ej7_While {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, dato, cont = 0, suma = 0, valMax = Integer.MIN_VALUE  , valMin = Integer.MAX_VALUE;
        
        System.out.println("Ingrese el total de numeros a promediar: ");
        num = leer.nextInt();
        
        while (num>cont){
            System.out.println("Ingrese numero: ");
            dato = leer.nextInt();
            if (dato > valMax) {
                valMax = dato;
            } 
            if (dato < valMin ) {
                valMin = dato;
            }
            cont ++;
            suma += dato;
        }
        System.out.println("El promedio de todos los datos es de: " + (suma/num) );
        System.out.println("El mayor numero ingresado fue: " + valMax);
        System.out.println("El menor numero ingresado fue: " + valMin);
    }
    
}
