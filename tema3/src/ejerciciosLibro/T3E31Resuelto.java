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
public class T3E31Resuelto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	int numero = 1;
	int cuadrado;
	boolean par, positivo;
	Scanner teclado = new Scanner(System.in);
	
	    while (numero != 0) {
	        System.out.println("Introduce un número (para finalizar el programa introduzca 0):");
	        numero = teclado.nextInt();
	        par = numero % 2 == 0;
	        cuadrado = numero*numero;
	        positivo = numero >= 0;
	    
	    
	        System.out.println("El numero es: " + numero);
	        System.out.println("Su cuadrado es: " + cuadrado);
	        System.out.println("¿Es par?: " + par);
	        System.out.println("¿Es positivo?: " + positivo);
	    }
	}
}