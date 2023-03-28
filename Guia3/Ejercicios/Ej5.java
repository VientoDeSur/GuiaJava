package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma 
de los numeros introducidos supere el limite inicial.

 */
public class Ej5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num = 0, aux;
        int suma = 0;
        System.out.println(suma + " " + num);
        System.out.println("Ingrese un numero limite para realizar una cuenta:");
        num = leer.nextInt();

        while (suma <= num) {
            System.out.println("Ingrese numeros a sumar hasta salir del bucle: ");
            aux = leer.nextInt();
            suma = suma + aux;
        }

        System.out.println("La suma de los numeros es de: " + suma);
    }
}
