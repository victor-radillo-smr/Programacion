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
public class Condicionales2 {
public static void main(String[] args) {
// TODO code application logic here
double a, b, c, discriminante,denominador,solucion1,solucion2;

Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el coeficiente para la variable a: ");
a = teclado.nextDouble();

System.out.println("Introduce el coeficiente para la variable b: ");
b = teclado.nextDouble();

System.out.println("Introduce el coeficiente para la variable c: ");
c = teclado.nextDouble();

discriminante = (b*b-4*a*c);
denominador = 2*a;

solucion1 = -b + Math.sqrt(discriminante )/ denominador;
solucion2 = -b - Math.sqrt(discriminante )/ denominador;

    if (discriminante < 0 || denominador < 0 ) {
        System.out.println("ERROR no puede dividirse por 0 o tener discriminante negativo.");
    
    }else{
        System.out.println("La solucion es: "+ (solucion1 + solucion2));
        
    }
}
}
