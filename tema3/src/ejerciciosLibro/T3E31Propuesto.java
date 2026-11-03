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
public class T3E31Propuesto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
	int max = -127;
	int min = 128;
	Scanner teclado = new Scanner(System.in);
	
	    while (numero != -1) {
	        System.out.println("Introduce la edad de un alumno: ");
	        numero = teclado.nextInt();
	        
	        if (numero > 0) {
                if (numero > max) {
                    max = numero;
                }
                if (numero < min) {
                    min = numero;
                }
	        } else {
	            System.out.println("Es imposible que una edad sea menos que 0.");	
	        }
	    }
    System.out.println("La edad mas alta es " + max + " y la edad mas baja es " + min);	    
	}
}