/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaJava.GPT;

/**
 *
 * @author Raul Borrell
 */
import java.util.Scanner;

public class JuegoRobots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[10][10];
        int posX = 0, posY = 0;
        int gemasRecogidas = 0;

        // Colocar obstáculos y gemas aleatoriamente
        for (int i = 0; i < 10; i++) {
            int fila = (int) (Math.random() * 10);
            int col = (int) (Math.random() * 10);
            if (tablero[fila][col] == 0) {
                if (Math.random() < 0.3) {
                    tablero[fila][col] = 1;
                } else {
                    tablero[fila][col] = -1;
                }
            } else {
                i--;
            }
        }

        // Juego
        while (gemasRecogidas < 5) {
            // Dibujar tablero
            System.out.println("+----------+");
            for (int i = 0; i < 10; i++) {
                System.out.print("|");
                for (int j = 0; j < 10; j++) {
                    if (i == posY && j == posX) {
                        System.out.print("X");
                    } else if (tablero[i][j] == 0) {
                        System.out.print(" ");
                    } else if (tablero[i][j] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("O");
                    }
                }
                System.out.println("|");
            }
            System.out.println("+----------+");
            System.out.println("Gemas recogidas: " + gemasRecogidas);

            // Leer dirección del movimiento
            System.out.print("Mover (arriba=a, abajo=b, izquierda=i, derecha=d): ");
            String direccion = sc.nextLine();

            // Actualizar posición del robot
            switch (direccion) {
                case "w":
                    if (posY > 0) {
                        posY--;
                    }
                    break;
                case "s":
                    if (posY < 9) {
                        posY++;
                    }
                    break;
                case "a":
                    if (posX > 0) {
                        posX--;
                    }
                    break;
                case "d":
                    if (posX < 9) {
                        posX++;
                    }
                    break;
            }

            // Verificar si se recogió una gema
            if (tablero[posY][posX] == 1) {
                gemasRecogidas++;
                tablero[posY][posX] = 0;
                System.out.println("¡Gema recogida!");
            }

            // Verificar si se chocó con un obstáculo
            if (tablero[posY][posX] == -1) {
                System.out.println("¡Choque! Fin del juego.");
                break;
            }
        }

        // Mostrar resultado final
        if (gemasRecogidas == 5) {
            System.out.println("¡Felicidades! Recogiste todas las gemas.");
        }
        System.out.println("Gemas recogidas: " + gemasRecogidas);
        System.out.println("¡Gracias por jugar!");
    }
}
