/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojadeejercicios1;

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
        
       // esta es la primera parte del ejercicio en la que nosotros declaramos num1 y num2
       
       int num1, num2, suma, resto, division, resta, multiplicacion;
       
       num1 = 12;
       num2 = 4;
       
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
