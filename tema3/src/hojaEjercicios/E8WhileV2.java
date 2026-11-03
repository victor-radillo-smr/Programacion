package hojaEjercicios;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class E8WhileV2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, resultado; 
        int x = 1;
        Scanner teclado = new Scanner(System.in);     
        
        while (x != 4) {
                    
            System.out.println("¿Que operacion quieres realizar? ");
            System.out.println("1.Sumar ");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar ");
            System.out.println("4.Salir ");
            x = teclado.nextInt();
           
            System.out.println("Dame un numero para realizar una operacion: ");
            num1 = teclado.nextInt();
        
            System.out.println("Dame un  segundo numero para realizar una operacion: ");
            num2 = teclado.nextInt();
        
            switch (x) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma entre " + num1 + " + " + num2 + " es " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta entre " + num1 + " - " + num2 + " es " + resultado);
                    resultado = num2 - num1;
                    System.out.println("El resultado de la resta entre " + num2 + " - " + num1 + " es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion entre " + num1 + " x " + num2 + " es " + resultado);
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                default:
                    System.out.println("ERROR has introducido una opcion no contemplada por favor introduce una opcion valida");
            }
        }
    }
}
