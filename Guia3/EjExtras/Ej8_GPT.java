/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

public class Ej8_GPT {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, contPar = 0, contImp = 0, cont = 0;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num < 0) {
                System.out.println("El numero es menor que 0 y no es valido.");
            } else if (num % 5 == 0) {
                break;
            } else if (num % 2 == 0) {
                contPar++;
                cont++;
            } else {
                contImp++;
                cont++;
            }
        } while (true);

        System.out.println("La cantidad de numeros fueron " + cont);
        System.out.println("La cantidad de numeros pares fueron " + contPar);
        System.out.println("La cantidad de numeros impares fueron " + contImp);
    }
}
