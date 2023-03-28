package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.

 */
public class Ej6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, pro = 0;
        double alt, altPro = 0, altMed = 0;

        System.out.println("Ingrese la cantidad de personas que desea calcular el promedio dwe altura: ");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la altura: ");
            alt = leer.nextDouble();
            if (alt <= 1.6) {
                altMed += alt;
                pro += 1;
            } else {
                altPro += alt;
            }
        }
        System.out.println("La altura promedio total es de: " + ((altPro + altMed) / num));
        System.out.println("La altura promedio de las personas menores o iguales a 1,60 mts es de :" + (altMed / pro));
    }

}
