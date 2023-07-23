/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CaracteresRecursivos;

/**
 *
 * @author krrmi
 */

import java.util.Scanner;
public class CaracteresRecursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una secuencia de caracteres: ");
        String input = scanner.nextLine();

        String inver = invertCaracters(input);
        System.out.println("Secuencia invertida: " + inver);
    }

    public static String invertCaracters(String str) {
        
        if (str.length() <= 1) {
            return str;
        } else {
            
            char ultimo = str.charAt(str.length() - 1);
            String cadena = str.substring(0, str.length() - 1);
            return ultimo + invertCaracters(cadena);
        }
    }
}
