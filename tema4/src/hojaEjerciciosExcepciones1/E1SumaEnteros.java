/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjerciciosExcepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E1SumaEnteros {
    
    static int leeNumero(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        
        do {            
            try {
                num = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Error Debes de introducir un número entero para realizar la operacion porfavor introducee un número entero: ");
                sc.nextLine();
            }
        } while (!correcto);
        return num;
    }
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
       
        System.out.println("Dame el primer número para la operacion: ");
        int digito1 = leeNumero();
        System.out.println("Dame el segundo número para la operacion: ");
        int digito2 = leeNumero();
        
        int resultado = digito1 + digito2;
        System.out.println("La suma de ambos números es: " + resultado);
    }
}
