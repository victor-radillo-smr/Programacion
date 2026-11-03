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
public class E3While {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		int num;
        
        System.out.println("Introduce el numero desde el que se iniciara la cuenta atras. ");
        num = new Scanner(System.in).nextInt();

        if (num == 0) {
            System.out.println("No puedo iniciar una cuenta atras con un 0");
        } else if (num < 0) {
                System.out.println("No puedo iniciar la cuenta atras con un número negativo");
        } else {
            while (num > 0) {
                System.out.println(num);
                num --;
            }
            System.out.println("Despegue.");
        }
    }
}