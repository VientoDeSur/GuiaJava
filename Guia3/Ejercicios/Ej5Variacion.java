package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Raul Borrell
 */
public class Ej5Variacion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, aux;
        int suma = 0;
        System.out.println("Ingrese un numero limite para realizar una cuenta:");
        num = leer.nextInt();

        do {
            System.out.println("Ingrese numeros a sumar hasta salir del bucle: ");
            aux = leer.nextInt();
            suma += aux;
        } while (suma <= num);

        System.out.println("La suma de los numeros es de: " + suma);
    }

}
