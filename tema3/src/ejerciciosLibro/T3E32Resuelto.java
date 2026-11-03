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
public class T3E32Resuelto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	    int numero = 0;
	    int suma = 0;
	    int cantidadAlumnos = 0;
	    int mayoresDeEdad = 0;
	    int media;
	    Scanner teclado = new Scanner(System.in);
	
	        while (numero >= 0) {
	            System.out.println("Introduce la edad de un alumno: ");
	            numero = teclado.nextInt();
	            
	             if (numero > 0) { 
	            suma = suma + numero;
	            cantidadAlumnos ++;
	             }
	            
	            if (numero >= 18) {
	                mayoresDeEdad ++;
	            }

	        }
	   media = suma / cantidadAlumnos;
	   System.out.println("La cantidad de alumnos es: "+ cantidadAlumnos);
	   System.out.println("De los cuales mayores de edad son: "+ mayoresDeEdad);
	   System.out.println("La suma de las edades de todos los alumnos es: "+ suma);
	   System.out.println("Y su media de edad es: "+ media);
	}	  
}