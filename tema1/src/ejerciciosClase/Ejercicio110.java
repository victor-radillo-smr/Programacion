/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosClase;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio110 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Decreto todas las variables y creo el scanner
    boolean lluvia, biblioteca, tareas, resultado;
    Scanner teclado = new Scanner(System.in);
    
        // pregunto al usuario si llueve o no y almaceno el resultado que nos ha dado elusuario como la variable lluvia.
        System.out.println("Esta lloviendo? (Escribe true para si o false para no): ");
        lluvia = teclado.nextBoolean();
        
        //pregunto al usuario si ha hecho sus tareas o no  y almaceno el resultado que nos ha dado como la variable tareas.
        System.out.println("Hiciste tus tareas? (Escribe true para si o false para no): ");
        tareas = teclado.nextBoolean();
        
        //pregunto al usuario si tiene que ir a la biblioteca o no y almaceno el resultado que nos ha dado en la variable biblioteca.
        System.out.println("Tienes que ir a la biblioteca? (Escribe true para si o false para no): ");
        biblioteca = teclado.nextBoolean();
        
        //comparo la negacion de la variable lluvia y la variable tareas mediate el operador lógico and y despues ese resultado lo comparo mediante el operador lógico or con la variable biblioteca.
        resultado = (!lluvia) && tareas || biblioteca;
        
        // dependiendo del resultado es true o false mostramos en pantalla "puede salir" o "no puede salir".
        if (resultado = true) {
            System.out.println("Puedes salir");
        }else{
        System.out.println("No puede salir");
        }
    }
}   
