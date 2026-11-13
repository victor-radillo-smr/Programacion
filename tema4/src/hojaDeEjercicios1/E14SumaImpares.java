package hojaDeEjercicios1;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class E14SumaImpares {
    
    /**
     * Funcion que calcula la suma de números impares a partir
     * de un número entregado por el usuario.
     * @param num1 numero entregado por el  usuario (tipo int).
     * @return  devuelve la suma de todos los números impares (tipo int).
     */
    static int SumaImpares(int num1){
        
        int suma = 0;
        
        for (int contador = num1 ; contador > 0 ; contador --) {
            if (contador % 2 != 0) {              
            suma = contador + suma;
            }
        }
        if (num1 > 0) {
            System.out.println("La sumade todos los numeros impares desde 1 hasta " + num1 + " es: " + suma);  
        }   
        return suma;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 1;
        Scanner teclado = new Scanner(System.in);
        
        while (num >= 0) {
            System.out.println("Introcuce un número positivo entero.");
            num = teclado.nextInt();
        
            if (num == 0 ) {
                System.out.println("No puedes introducir  0 ya que no puedo sumar nada");
            } else {
                SumaImpares(num);
            }
        }
    }
}

