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
public class Condicionales8 {
public static void main(String[] args) {
// TODO code application logic here     

double comidaDiaria, kilosPorAnimal, totalComidaNecesaria, falta ;
int numAnimales;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la cantidad de comida en kg de la que disponemos hoy: ");
comidaDiaria = teclado.nextDouble();

System.out.println("Introduce la cantidad de animales a alimentar: ");
numAnimales = teclado.nextInt();

System.out.println("Introduce la cantidad de Kg que come de media un animal: ");
kilosPorAnimal = teclado.nextDouble();


    if (numAnimales <= 0) {
        System.out.println("ERROR no podemos calcular con menos de un animal.");
    }else{
        totalComidaNecesaria = kilosPorAnimal * numAnimales;
        
        if (comidaDiaria > totalComidaNecesaria) {
            System.out.println("Dispones de comida suficiente para tus animales.");
        }else{
            falta = totalComidaNecesaria - comidaDiaria;
            System.out.println("Te faltan " + falta + " Kg de comida para poder alimentar a tus animales.");
            
            
        }
        
    }


}
}