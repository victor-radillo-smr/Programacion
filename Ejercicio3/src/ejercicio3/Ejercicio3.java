/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la media puede contener decimales */
        byte nota1,nota2;
        float media;
        System.out.print("Introduce la primera nota: ");
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextByte();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextByte();
        media = (nota1+nota2)/2;
        System.out.println("La nota media de el alumno es: " + media);
         
    }
    
}
