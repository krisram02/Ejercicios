/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MatrizRe;

/**
 *
 * @author krrmi
 */
import java.util.Scanner;
public class matrizRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño de la matriz: ");
        int tamano = scanner.nextInt();

        int[][] matriz = new int[tamano][tamano];

        System.out.println("Ingresa los elementos de la matriz fila por fila:");
        ingresarValores(matriz, 0, 0, scanner);

        System.out.println("\nLa matriz es:");
        mostrarMatriz(matriz, 0, 0);

    }

    private static void ingresarValores(int[][] matriz, int fila, int columna, Scanner scanner) {
        if (fila == matriz.length) {
            return;
        }

        if (columna == matriz[fila].length) {
            ingresarValores(matriz, fila + 1, 0, scanner);
            return;
        }

        System.out.print("Ingresa el elemento en la posición [" + fila + "][" + columna + "]: ");
        matriz[fila][columna] = scanner.nextInt();
        ingresarValores(matriz, fila, columna + 1, scanner);
    }

    private static void mostrarMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return;
        }

        if (columna == matriz[fila].length) {
            System.out.println();
            mostrarMatriz(matriz, fila + 1, 0);
            return;
        }

        System.out.print(matriz[fila][columna] + " ");
        mostrarMatriz(matriz, fila, columna + 1);
        }
    }

    
