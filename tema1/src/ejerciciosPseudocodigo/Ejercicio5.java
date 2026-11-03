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
public class Ejercicio5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();
        
        if (num > 0) {
            System.out.println("El número es positivo");
        }else{
            if (num < 0) {
                System.out.println("El número es negativo");
                
            }
            
        }
}
}