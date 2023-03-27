package Guia3.EjExtras;

import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

*/
public class Ej9 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE, cont = 0;
        
        do {
        do {
            System.out.println("Ingrese el primer numero a ser dividido: ");
        num1 = leer.nextInt();
            if (num1<1) {
                System.out.println("El numero ingresado es menor que 1.");
               }
           
        } while (num1<1);
        
        do {
            System.out.println("Ingrese el segundo numero para dividir el primero: ");
        num2 = leer.nextInt();
            if (num2<1) {
                System.out.println("El numero ingresado es menor que 1.");
               }
           
        } while (num2<1);
            if (num1<num2) {
                System.out.println("El primer numero es menor al segundo y no se puede dividir.");
            }
        } while (num1<num2);
        
        
        while (num1>num2){
        num1 = num1-num2;
        cont ++;
        
        }
        System.out.println("El conciente de la division es; " + cont);
        System.out.println("El resto es: " + num1);
    }
    
}
