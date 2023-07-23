/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumEntero;

/**
 *
 * @author krrmi
 */
import java.util.Scanner;

public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int producto = calcularProductoRecursivo(num1, num2);
        System.out.println("El producto es: " + producto);
    }

    public static int calcularProductoRecursivo(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + calcularProductoRecursivo(num1, num2 - 1);
        } else {
            return -calcularProductoRecursivo(num1, -num2);
        }
    }
}

    
    