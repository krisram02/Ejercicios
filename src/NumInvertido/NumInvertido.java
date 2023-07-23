/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumInvertido;

/**
 *
 * @author krrmi
 */
import java.util.Scanner;
public class NumInvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa eL número: ");
        int numero = scanner.nextInt();
        int numeroInvertido = numInvrt(numero);
        System.out.println("El número invertido es: " + numeroInvertido);
    }

    public static int numInvrt(int numero) {
        if (numero < 10) {
            
            return numero;
        } else {
            int ultimoDigito = numero % 10;
            int restoNumero = numero / 10;
            int longitudResto = (int) Math.log10(restoNumero) + 1;

            ///RECURSIVO 
            int restoInvertido = numInvrt(restoNumero);

            int numeroInvertido = (int) (ultimoDigito * Math.pow(10, longitudResto)) + restoInvertido;
            return numeroInvertido;
            //SE CONCATENA EL ULTIMO NUM
        }
    }
}

