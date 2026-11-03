package hojaEjercicios;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class E7While {
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int numSecreto = (int) (Math.random() * 100 + 1);
        int respuesta;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Empieza el juego del número secreto introduce un número entre el 1 y el 100 para empezar a jugar");
        respuesta = teclado.nextInt();
        
            while (respuesta != numSecreto) {
                if (respuesta < 0) {
                    System.out.println("El número introducido no puede ser menor que 0");
                    respuesta = teclado.nextInt();
                } else if (respuesta > 100) {
                    System.out.println("El número introducido no puede ser mayor que 100");
                    respuesta = teclado.nextInt();
                
                } else if (respuesta > numSecreto) {
                    System.out.println("Demasiado alto");
                    respuesta = teclado.nextInt();
                } else {
                    System.out.println("Demasiado bajo");
                    respuesta = teclado.nextInt();
                }
            }
            System.out.println("Correcto");
    }
}
