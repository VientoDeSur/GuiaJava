package GuiaJava.Guia3.Ejercicios;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
public class Ej7 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cor = 0, inc = 0, lon = 0;
        String frase = "";
        
        do {
          
            if (lon == 5) {
                if ((frase.substring(0,1).equalsIgnoreCase("x")) && (frase.substring(4,5).equalsIgnoreCase("o" ))){
                    cor += 1;
                }else {
                    inc += 1;
                }
            }
            System.out.println("Ingrese una palabra o frase de 5 caracteres de longitud. ");
            System.out.println("Recuerde que si desea terminar el programa debera introducir &&&&&.");
            frase = leer.nextLine();
            lon = frase.length();
            if (lon != 5) {
                System.out.println("La longitud de la frase o palabra es incorrecta.");
            }
        } while (!"&&&&&".equalsIgnoreCase(frase));
        
        System.out.println("Las frases o palabras correctas fueron: " + cor + " veces.");
        System.out.println("Las frases o palabras incorrectas fueron: " + inc + " veces.");
    }
}
