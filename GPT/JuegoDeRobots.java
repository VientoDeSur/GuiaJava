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

public class JuegoDeRobots {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = 0, y = 0, movimientos = 0;
            int objetivoX = (int) (Math.random() * 10);
            int objetivoY = (int) (Math.random() * 10);
            System.out.println("¡Bienvenido al juego de robots!");
            System.out.println("Objetivo: Mover el robot a la posición (" + objetivoX + ", " + objetivoY + ")");
            System.out.println("Instrucciones: ingresa 'w' para mover hacia arriba, 's' para mover hacia abajo, 'a' para mover hacia la izquierda y 'd' para mover hacia la derecha.");
            System.out.println("Comencemos!");
            while (x != objetivoX || y != objetivoY) {
                System.out.println("Posición actual: (" + x + ", " + y + ")");
                System.out.print("Ingresa un movimiento: ");
                String movimiento = sc.nextLine();
                switch (movimiento) {
                    case "w":
                        if (y > 0) {
                            y--;
                            movimientos++;
                        } else {
                            System.out.println("¡No puedes salir del tablero!");
                        }
                        break;
                    case "s":
                        if (y < 9) {
                            y++;
                            movimientos++;
                        } else {
                            System.out.println("¡No puedes salir del tablero!");
                        }
                        break;
                    case "a":
                        if (x > 0) {
                            x--;
                            movimientos++;
                        } else {
                            System.out.println("¡No puedes salir del tablero!");
                        }
                        break;
                    case "d":
                        if (x < 9) {
                            x++;
                            movimientos++;
                        } else {
                            System.out.println("¡No puedes salir del tablero!");
                        }
                        break;
                    default:
                        System.out.println("Movimiento inválido. Intenta de nuevo.");
                        break;
                }
            }   System.out.println("¡Felicidades! Llegaste a la posición (" + objetivoX + ", " + objetivoY + ") en " + movimientos + " movimientos.");
        }
    }

}
