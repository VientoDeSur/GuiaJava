package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
*/
public class Ej4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
    
        do {
            System.out.println("Ingrese un numero del 1 al 10 para ser converitdo a numero romano");
            num = leer.nextInt();
                switch (num){
                    case 1:
                    System.out.println("El numero romano es: I ");
                    break;
                    case 2:
                    System.out.println("El numero romano es: II ");
                    break;
                    case 3:
                    System.out.println("El numero romano es: III ");
                    break;
                    case 4:
                    System.out.println("El numero romano es: IV ");
                    break;
                    case 5:
                    System.out.println("El numero romano es: V ");
                    break;
                    case 6:
                    System.out.println("El numero romano es: VI ");
                    break;
                    case 7:
                    System.out.println("El numero romano es: VII ");
                    break;
                    case 8:
                    System.out.println("El numero romano es: VIII ");
                    break;
                    case 9:
                    System.out.println("El numero romano es: IX ");
                    break;
                    case 10:
                    System.out.println("El numero romano es: X ");
                    break;
                    default:
                        System.out.println("El numero ingresado no esta en el rango de 1 a 10.");
                            }
        } while(num < 1 || num > 10);
    }
}