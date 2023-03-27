package GuiaJava.Guia3;

import java.util.Scanner;

public class Ej6Guia3_if {
//Implementar un programa que le pida dos números enteros al usuario 
//y determine si ambos o alguno de ellos es mayor a 25.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        if (num1>25 && num2<25) {
            System.out.println("El primer numero es mayor a 25");
            
        } else if (num1<25 && num2>15){
            System.out.println("El segundo numero es mayor a 25");
        } else{
            System.out.println("Ninguno de los 2 numeros son mayores a 25");
        }
        
        
        
        
        
        
        
               
    }
}
