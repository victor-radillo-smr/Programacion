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
public class Ejercicio1 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte edad;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce tu edad: ");
        
        edad = teclado.nextByte();
        
        if (edad >= 18){
            System.out.print("Eres mayor de edad.");
        }
    }
}