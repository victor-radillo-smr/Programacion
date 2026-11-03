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
public class Condicionales5 {
public static void main(String[] args) {
// TODO code application logic here
byte temperatura;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la temperatura del aula: ");
temperatura = teclado.nextByte();

    if (temperatura < 12) {
    System.out.println("Mucho frio.");
    
    } else if (temperatura < 22) {
    System.out.print("Frio.");
    
    } else if (temperatura < 32 ) {
    System.out.print("Calor.");
    
    } else {
    System.out.print("Mucho calor.");
    }    
    }   
    }