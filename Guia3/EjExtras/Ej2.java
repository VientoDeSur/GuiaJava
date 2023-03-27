package GuiaJava.Guia3.EjExtras;

import java.util.Scanner;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar.

*/

public class Ej2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, aux = 0;
        System.out.println("Ingrese 4 valores: ");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        
 //       while (d == aux) {            
   //         if (b == b) {
     //           aux = b;
       //     } else if (){
         //   }
        // }
    
     //  do {
       //     if (a == a){
         //       c = a;
           //     a = d;          //le asigne a b el valor de c
           // } else if (b == b) {
             //   aux = b;        //GuarAde el auxiliar
               /// b = c;
           /// } else if (d == d){
              ///  d = aux;
           /// }
       /// } while (d == aux);
        
            aux = b;
            b = c;
            c = a;
            a = d;
            d = aux;
            
               
       
        System.out.println("El primero valor ahora es :" + a);
        System.out.println("El segundo valor ahora es :" + b);
        System.out.println("El tercero valor ahora es :" + c);
        System.out.println("El cuarto valor ahora es :" + d);
    }
    
}
