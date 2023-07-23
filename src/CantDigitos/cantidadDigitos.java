/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CantDigitos;

/**
 *
 * @author krrmi
 */
import java.util.Scanner;
public class cantidadDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        
        int numero = scanner.nextInt();

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDigitos);
    }

    public static int contarDigitos(int numero) {
        if (numero == 0) {
            
            return 0; //NO CUENTA EL 0
        } else {
            
            return 1 + contarDigitos(numero / 10); //LLAMADA RECURSIVA
        }
    }
}