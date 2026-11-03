/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosPseudocodigo;
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
        //decretamos las variables
     int nota1, nota2;
     float media;
     
     //Despues de haber importado el Scanner Creamos un nuevo Scanner llamado Teclado
     Scanner teclado = new Scanner(System.in);
     
     //Pedimos al usuario que introduzca la primera nota y gracias al Scanner la almacenamos como la varaiable nota1 tipo int
     System.out.println("Introduce la primera nota: ");
     nota1 = teclado.nextInt();
     
     //Pedimos al usuario que introduzca la segunda nota y gracias al Scanner la almacenamos como la varaiable nota2 tipo int
     System.out.println("Introduce la segunda nota: ");
     nota2 = teclado.nextInt();
     
     
     media = (nota1+nota2)/2;
     System.out.println("La media aritmetica de este alumno es: " + media);
    }
}
