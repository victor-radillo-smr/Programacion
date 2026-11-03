/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjercicios;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el un número para dibujar el triángulo: ");
        num = sc.nextInt();
        
        for ( ; num > 0 ; num --){
            for (int i = num ; i > 0 ; i --){
                if (i > 1){
                    System.out.print("* ");
                } else {
                    System.out.println("*"); 
                }
            }
        }
    }
}
