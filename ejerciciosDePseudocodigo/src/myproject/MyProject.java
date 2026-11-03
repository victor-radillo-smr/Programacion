/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print ("Introduce un número entero: ");
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        System.out.print("Ha introducido el número: " + numero);
                
    }
    
}
