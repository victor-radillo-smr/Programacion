/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E5Max {
    
    /**
    * Esta funcion sirve para comparar dos números a partir de dos dados por el usuario y devuelve el mayor.
    * @param num1 Este seria el primer número entregado por el usuario.
    * @param num2 Este seria el segundo número entregado por el usuario.
    * @return Devolveria el resultado de la comparacion de ambos números sobre cual es el mayor.
     */
    static int numeroMayor(int num1, int num2){
        int resultado;
        
        if (num1>num2) {
            resultado = num1;    
        } else {
            resultado = num2;
        }
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primero, segundo, mayor;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Dame el primer número: ");
        primero =sc.nextInt();
    
        System.out.println("Dame el segundo número: ");
        segundo =sc.nextInt();
    
        mayor = numeroMayor(primero, segundo);
        System.out.println("El número mayor es: " + mayor);
    }
}
