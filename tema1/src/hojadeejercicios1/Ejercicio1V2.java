/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojadeejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio1V2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // esta es la primera parte del ejercicio en la que nosotros declaramos num1 y num2
       
       int num1, num2, suma, resto, division, resta, multiplicacion;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Introduce el primer número entero: ");
       
       num1 = teclado.nextInt();
       
       System.out.println("Introduce el segundo número entero: ");
       
       num2 = teclado.nextInt();
       
       System.out.println( "Los numeros son: " + num1 + " y " + num2 + ".");
       
       suma = num1 + num2;
       resta = num1 - num2;
       multiplicacion = num1 * num2;
       division = num1 / num2;
       resto = num1 % num2;
       
        System.out.println( "La multiplicacion de " + num1 + " y " + num2 + " es " + multiplicacion + ".");
        System.out.println( "La suma de " + num1 + " y " + num2 + " es " + suma + ".");
        System.out.println( "La resta de " + num1 + " y " + num2 + " es " + resta + ".");
        System.out.println( "El cociente de la division de " + num1 + " y " + num2 + " es " + division + ".");
        System.out.println( "El resto de la division de " + num1 + " y " + num2 + " es " + resto + ".");
        
       resta = num2 - num1;
       division = num2 / num1;
       resto = num2 % num1;
       
        System.out.println( "La resta de " + num2 + " y " + num1 + " es " + resta + ".");
        System.out.println( "El cociente de la division de " + num2 + " y " + num1 + " es " + division + ".");
        System.out.println( "El resto de la division de " + num2 + " y " + num1 + " es " + resto + ".");
    }
}
