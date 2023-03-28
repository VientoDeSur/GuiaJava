package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
public class Ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int min, hora = 0, dia = 0;
        System.out.println("Ingrese los minutos a calcular: ");
        min = leer.nextInt();

        //horas = 60 min
        //dia = 1440 min
        while (min >= 1440) {
            dia++;
            min -= 1440;
        }
        while (min >= 60) {
            hora++;
            min -= 60;
        }
        System.out.println("Son " + dia + " y " + hora + " horas.");
    }
}
