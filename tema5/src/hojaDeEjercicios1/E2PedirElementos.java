/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E2PedirElementos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla1[] = new int [10];
        int i = 0;
        boolean controlador = false; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa sirve para rellenar un array.");
        
        for( ; i<10; i++){
            System.out.println("");
            System.out.println("Introduce el " + (i+1) + "º item del array recuerda que tiene que ser un número entero: ");
            
            do{
                try {
                    tabla1[i] = sc.nextInt();
                    controlador = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error Introduce un número entero: ");
                    sc.nextLine();
                }
            }while (!controlador);
        }
        System.out.println("este es el array que has creado: " + Arrays.toString(tabla1));
    }
}
