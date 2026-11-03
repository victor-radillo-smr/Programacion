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
public class T2E26 {
public static void main(String[] args) {
// TODO code application logic here
int num1, num2;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el primer número: ");
num1 = teclado.nextInt();

System.out.println("Escribe un número distinto del primer número");
num2 = teclado.nextInt();

    if (num1 > num2) {
        System.out.println( num1 + " es el número mayor.");
    } else if (num1 < num2) {
    System.out.print(num2 + " es el número mayor.");
    } else {
    System.out.print(" ERROR ambos números tienen el mismo valor.");
    }    
    }  
    }