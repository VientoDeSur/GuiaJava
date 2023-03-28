package GuiaJava.Guia4.Ejercicios;

import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class Ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String resultado;
        resultado = func();

    }

    public static String func() {
        Scanner leer = new Scanner(System.in);
        String nombre, edad, ciclo;
        int conversion;
        do {
            System.out.println("Ingrese Nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese Edad: ");
            edad = leer.nextLine();
            conversion = Integer.parseInt(edad);
            System.out.println("El nombre es " + nombre + " y la edad es de " + edad);
            if (conversion > 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
            System.out.println("Escriba no si quiere salir (NO): ");
            ciclo = leer.nextLine();
        } while (!ciclo.equalsIgnoreCase("no"));

        return nombre + edad;
    }
}
