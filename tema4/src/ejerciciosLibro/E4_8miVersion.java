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
public class E4_8miVersion {
    /**
     * Esta funcion es el menú de seleccion de operacion a realizar.
     */
    static void menu(){
        System.out.println("MENÚ DE SELECCION DE OPERACIONES.");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir del programa.");
        System.out.println(" ");
        
    }
    /**
     * Esta funcion hace las operaciones de suma, resta, multiplicación y división dependiendo de la decision
     * tomada por el usuario del num1 y num 2 la cual devuelve un resultado tipo double.
     * 
     * @param decision eleccion tomada por el usiario para la operacion tipo int
     * @param num1 primer operando tipo float
     * @param num2 segundo operando tipo float
     */
    static double calculadora(int decision ,float num1, float num2){
        double resultado;
        switch (decision) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Hasta luego.");
                resultado = 0;
        }
       return resultado;
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int decision;
        float operando1, operando2;
        Scanner sc = new Scanner(System.in);
        do {            
        
            menu();
            System.out.println(" ");
            System.out.print("Dame una opcion: ");
            decision = sc.nextInt();
        
            while (decision < 1 || decision > 5) {
                System.out.println(" ");
                System.out.println("OPCION NO VALIDA");
                System.out.println(" ");
                menu();
                decision = sc.nextInt();
            }
            
            System.out.println(" ");
            
            if (decision != 5){
                System.out.print("Dame el primer operando: ");
                operando1 = sc.nextFloat();
            
                System.out.println(" ");
        
                System.out.print("Dame el segundo operando: ");
                operando2 = sc.nextFloat();
        
                System.out.println(" ");
        
                double resultado = calculadora(decision, operando1, operando2);
                switch (decision) {
                    case 1:
                        System.out.println(operando1 + " + " + operando2 + " = " + resultado);
                        break;
                    case 2:
                        System.out.println(operando1 + " - " + operando2 + " = " + resultado);
                        break;
                    case 3:
                        System.out.println(operando1 + " * " + operando2 + " = " + resultado);
                        break;
                    case 4:
                        System.out.println(operando1 + " / " + operando2 + " = " + resultado);
                        break;
                }
                System.out.println(" ");
            }
        }while (decision != 5);
    }
}  