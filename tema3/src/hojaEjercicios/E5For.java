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
public class E5For {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, contador;
        int suma = 0;
        
        System.out.println("Introcuce un número positivo entero.");
        num = new Scanner(System.in).nextInt();
        contador = num;
        
        if (num <= 0 ) {
        System.out.println("No puedes introducir un numero negativo o que sea 0");
        } else {
            for (; contador != 0 ; contador --) {
                if (contador % 2 != 0) {
                    suma = contador + suma;
                }
            }
            System.out.println(" la sumade todos los numeros impares desde 1 hasta " + num + " es: " + suma);
        }
    }
}

