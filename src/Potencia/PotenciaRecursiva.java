/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Potencia;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PotenciaRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número base: ");
        int base = lector.nextInt();
        System.out.println("Introduzca el número exponente: ");
        int exponente = lector.nextInt();
        System.out.printf("%n%d elevado a %d es igual a %.3f", base, exponente, Recursividadpotencia(base, exponente));
        
        
    }
    private static double Recursividadpotencia(int base, int exponente){
        
        if (exponente==0){
            return 1;
        }else if(exponente < 0){
            return Recursividadpotencia(base, exponente + 1)/base;
        }else{
            return base*Recursividadpotencia(base, exponente-1);
        }
    }
    
}
