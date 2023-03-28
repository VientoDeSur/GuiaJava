package GuiaJava.Guia3;

import java.util.Scanner;

/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ej8Guia3_while {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de su nota de examen: ");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("La nota ingresada es erronea, los valores aceptados comprenden entre el 0 y el 10. Ingrese nuevamente la nota: ");
            nota = leer.nextInt();

        }
    }

}
