/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPseudocodigo;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un número entero: ");
        num1 = teclado.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }   
}
}
