/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VectorRe;

/**
 *
 * @author krrmi
 */
public class VectorRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector = {4, 2, 8, 1, 10}; //INGRESAR DIGITOS DEL VECTOR
        mostrarVectorReversa(vector, vector.length - 1);
    }

    public static void mostrarVectorReversa(int[] vector, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(vector[index] + " "); 

        mostrarVectorReversa(vector, index - 1); //METODO RECURSIVO
    }
}

