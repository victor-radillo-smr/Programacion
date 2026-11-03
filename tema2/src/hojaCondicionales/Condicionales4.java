/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaCondicionales;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Condicionales4 {
public static void main(String[] args) {
// TODO code application logic here
float sueldo;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce tu salario: ");
sueldo = teclado.nextFloat();

    if (sueldo < 1000) {
    System.out.println("Muy malo.");
    
    } else if (sueldo >= 3000) {
    System.out.print("Muy bueno.");
    
    } else if (sueldo >= 1500) {
    System.out.print("Bueno.");
    
    } else {
    System.out.print("Malo.");
    }    
    }  
    }