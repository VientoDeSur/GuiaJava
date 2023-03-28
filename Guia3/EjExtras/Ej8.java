package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.

 */
public class Ej8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, contPar = 0, contImp = 0, cont = 0;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num >= 0) {
                if (num % 2 == 0) {
                    contPar = contPar + 1;
                    cont = cont + 1;
                } else {
                    contImp = contImp + 1;
                    cont = cont + 1;
                }
            } else {
                System.out.println("El numero es menor que 0 y no es valido.");
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros fueron " + cont);
        System.out.println("La cantidad de numeros pares fueron " + contPar);
        System.out.println("La cantidad de numeros impares fueron " + contImp);
    }
}
