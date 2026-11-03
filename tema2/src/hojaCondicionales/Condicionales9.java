/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaCondicionales;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Condicionales9 {
public static void main(String[] args) {
// TODO code application logic here

		double base, altura, area;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la base del triángulo: ");
		base = teclado.nextDouble();
		
		if (base < 0){
		    System.out.println("ERROR los numeros ingresados no pueden ser negativos. ");
		}else{
		    System.out.println("Introduce la altura del triángulo: ");
		    altura = teclado.nextDouble();   
		    
		    if (altura < 0) {
		       System.out.println("ERROR los numeros ingresados no pueden ser negativos. "); 
		    }else{
		        area = (base * altura) / 2;
		        System.out.println("El area del triangulo es: "+ area);
	}
}
}
}