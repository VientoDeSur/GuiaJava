package GuiaJava.Guia3;

import java.util.Scanner;

/* 
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado 
de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
public class Ej9Guia3_doWhile {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, cont = 0, suma = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            cont += 1;
            if (num == 0) {
                System.out.println("Se calculo el numero 0.");
                break;
            } else {
                suma += num;
            }
        } while (cont < 20);
        System.out.println("La suma de los numeros ingresados es de: " + suma);

    }
}
