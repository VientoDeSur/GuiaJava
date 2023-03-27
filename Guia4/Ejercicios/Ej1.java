package GuiaJava.Guia4.Ejercicios;

import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 

*/
public class Ej1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        double resultado;
        
        System.out.println("Ingrese el primer número:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();
        
        System.out.println("Elija una de las siguentes opciones: ");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Dividir ");
        System.out.println("4. Multiplicar ");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("La suma de los 2 numeros es de: " + resultado);
                break;
                case 2:
                resultado = restar(num1, num2);
                System.out.println("La resta de los 2 numeros es de: " + resultado);
                break;
                case 3:
                resultado = dividir(num1, num2);
                System.out.println("La division de los 2 numeros es de: " + resultado);
                break;
                case 4:
                resultado = multiplicar(num1, num2);
                System.out.println("La multiplicacion de los 2 numeros es de: " + resultado);
                break;
        }
        
    }
    public static int sumar(int num1, int num2){
        int suma;
        suma = num1 + num2;
        return suma;
    }
    public static int restar(int num1, int num2){
        int resta;
        resta = num1 - num2;
        return resta;
    }
    public static int dividir(int num1, int num2){
        int divide;
        divide = num1 / num2;
        return divide;
    }
    public static int multiplicar(int num1, int num2){
        int multiplica;
        multiplica = num1 * num2;
        return multiplica;
    }
}
