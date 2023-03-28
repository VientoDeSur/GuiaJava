/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJava.Guia5.Ejercicios;

/**
 *
 * @author Raul Borrell
 */
public class Ej5 {

    public static void main(String[] args) {

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        int[][] matriz2 = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};

        boolean condicion = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz2[j][i] != -(matriz[i][j])) {
                    condicion = false;
                    break;

                }
            }
            if (!condicion) {
                break;

            }

        }
        if (condicion) {
            System.out.println("La matriz es asimetrica");

        } else {
            System.out.println("La matriz no es asimetrica");
        }
    }
}
