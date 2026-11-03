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
public class E72While {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numSecreto = (int) (Math.random() * 100 + 1);
        int respuesta, intentos;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de intentos que quieres tener minimo 4 maximo 10.");
        intentos = teclado.nextInt();
        
        if (intentos < 4) {
            System.out.println("ERROR has introducido un valor inferior a 4 el programa va a cerrarse.");
        } else if (intentos > 10) {
            System.out.println("ERROR has introducido un valor superior a 10 el programa va a cerrarse.");    
        } else {
            System.out.println("Empieza el juego del número secreto introduce un número entre el 1 y el 100 para empezar a jugar.");
            respuesta = teclado.nextInt();
        
            while (respuesta != numSecreto && contador != intentos) {
                if (respuesta < 0) {
                    System.out.println("El número introducido no puede ser menor que 0.");
                    respuesta = teclado.nextInt();
                } else if (respuesta > 100) {
                    System.out.println("El número introducido no puede ser mayor que 100.");
                    respuesta = teclado.nextInt();
                
                } else if (respuesta > numSecreto) {
                    System.out.println("Demasiado alto.");
                    respuesta = teclado.nextInt();
                    contador ++;
                } else {
                    System.out.println("Demasiado bajo.");
                    respuesta = teclado.nextInt();
                    contador ++;
                }
            }
            if (numSecreto == respuesta) {
                System.out.println("Correcto has ganado el número era " +numSecreto);
            } else {
               System.out.println("No lo conseguiste el número secreto era " + numSecreto + " mejor suerte la proxima vez.");
            } 
        }
    }
}