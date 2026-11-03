/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosLibro;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class T3E35Resuelto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int CONTADOR = 0;
        int resultado, num1, num2;
        Scanner teclado = new Scanner(System.in);
           
            do {            
                num1  = (byte) (Math.random() * 100 + 1);
                num2  = (byte) (Math.random() * 100 + 1);
                System.out.println("Cuanto es " + num1 + " + " + num2);
                resultado = teclado.nextInt();
        
            } while (resultado == (num1 + num2)) ;  
                System.out.println("CORRECTO sigue asi.");
                CONTADOR ++;
            
            if (CONTADOR > 0) {
                System.out.println("Has acertado " + CONTADOR + " operaciones de suma."); 
            } else {
                System.out.println("No has acertado intentalo de nuevo");
            }
    }
}