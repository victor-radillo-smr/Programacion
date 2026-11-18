/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjerciciosExcepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E3DivisionSegura {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean correcto = false;
   
        do {
            try {
                System.out.print("Dame el primer número para la division: ");
                num1 = sc.nextInt();
                System.out.println(" ");
                System.out.print("Dame el segundo número para la division: ");
                num2 = sc.nextInt();
                System.out.println(" ");
                float div1 = num1 / num2;
                float resto1 = num1 % num2;
                float div2 = num2 / num1;
                float resto2 = num2 % num1;
                System.out.println("La division de " + num1 + " entre " + num2 + " da " + div1 + " con resto " + resto1);
                System.out.println("La division de " + num2 + " entre " + num1 + " da " + div2 + " con resto " + resto2);
                correcto = true;
                
            } catch (ArithmeticException e) {
                System.out.println("Error no se puede dividir por 0");
            }
            catch (InputMismatchException e){
                System.out.println("Error Debes introducir un número: ");
                sc.nextLine();
            }
        } while (!correcto);
       
    }
}
