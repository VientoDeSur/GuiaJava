package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar.
*/
public class Ej1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num<0) {
                System.out.println("El numero ingresado no corresponde a un numero positivo.");
                System.out.println("Ingrese de nuevo un numero: ");
                num = leer.nextInt();
            }
        } while (num < 0);

        if (num%2 == 0) {
            System.out.println("El numero " + num + " es par.");
            
        }else {
            System.out.println("El numero " + num + " es impar.");
        }
        
    }
    
}
