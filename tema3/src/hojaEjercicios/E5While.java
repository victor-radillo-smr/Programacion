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
public class E5While {
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
            while (contador != 0) {
                if (contador % 2 == 0) {
                contador --;               
                } else {
                    suma = contador + suma;
                    contador --;
                }
            }
            System.out.println(" la sumade todoslos numeros impares desde 1 hasta " + num + " es: " + suma);
        }
    }
}

