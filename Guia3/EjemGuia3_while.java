package Guia3;

import java.util.Scanner;

public class EjemGuia3_while {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  	 
   	String respuesta = "S";
  	 
   	while (respuesta.equalsIgnoreCase("S")) {
      	 
    	System.out.println("Desea continuar?");
    	respuesta = leer.nextLine();
   	   }

    }
    
}
