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
public class E21 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
	int cuadrado = 0;
	int base = 0;
	int resto = 0;
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Introduce el número con el cual quieres operar: ");
	numero = sc.nextInt();
		
	while (numero < 0) {
            System.out.println("El valor no pùede ser negativo introduce un valor correcto: ");
            numero = sc.nextInt();
		}
		
        while (cuadrado < numero) {
            base++;
            cuadrado = base * base;
        }

        if (cuadrado == numero) {
            System.out.println("El resultado de la raiz cuadrada de " + numero + " es " + base + ".");
            
        } else {
            base--;
            cuadrado = base * base;
            resto = numero - cuadrado;

            System.out.println("El resultado de la raiz cuadrada de " + numero + " es " + base + " con resto " + resto + ".");
	}
    }
}