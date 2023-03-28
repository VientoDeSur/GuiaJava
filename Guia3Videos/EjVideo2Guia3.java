package GuiaJava.Guia3Videos;

import java.util.Scanner;

public class EjVideo2Guia3 {

    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero entero positivo: ");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa podria tardar, ¿Estas seguro? (s/n)");
                String confirma = leer.nextLine();
                if (confirma.equals("s")) {
                    break;
                }
            }

        } while (num <= 0 || num >= 1000);

        int j;
        int suma;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                continue;
            }

            suma = 0;
            j = 1;
            while (j <= i) {
                suma += j;
                j++;

            }
            System.out.println("La suma de los " + i + " numeros naturales es" + suma);

        }

    }

}
