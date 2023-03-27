package Guia4;

import java.util.Scanner;

/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número 
es múltiplo del segundo, sino informe que no lo son.

*/
public class Ejercicio12_Procedimientos {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para saber si es dibisible del primer numero: ");
        num2 = leer.nextInt();
        
        esMultipo(num1,num2);
    }
   public static void esMultipo(int num1, int num2){
       if (num1%num2==0) {
           System.out.println("El primer numero es divisible por el segundo.");
       } else {
           System.out.println("El primer numero no es divisible por el segundo.");
       }
   
   }
}
