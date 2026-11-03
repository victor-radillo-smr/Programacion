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
public class E5ForV2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 1;
        int contador;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        
        while (num > -1) {
            System.out.println("Introcuce un número positivo entero.");
            num = teclado.nextInt();
            contador = num;
        
            if (num == 0 ) {
                System.out.println("No puedes introducir  0 ya que no puedo sumar nada");
            } else {
                for (; contador > 0 ; contador --) {
                    if (contador % 2 != 0) {              
                        suma = contador + suma;

                    }
                }
                if (num > 0) {
                    System.out.println("La sumade todos los numeros impares desde 1 hasta " + num + " es: " + suma);
                    suma = 0;  
                }
            }
        }
    }
}

