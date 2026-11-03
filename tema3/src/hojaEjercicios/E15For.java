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
public class E15For {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicando;
        int producto;
        boolean numeroValido = false;
        Scanner teclado = new Scanner(System.in);
        

        do {
            System.out.println("Dame un número para mostrate las tablas de multiplicar desde ese número hasta el 10");
            multiplicando = teclado.nextInt();

            if (multiplicando >= 1 && multiplicando <= 10) {
                numeroValido = true;
            } else {
                System.out.println("El valor introducido no es válido");
            }

        } while (!numeroValido);
    
        for ( ; multiplicando <= 10 ; multiplicando ++){
                        
            if (multiplicando == 5){
                continue;
            } else {
                System.out.println("Esta es la tabla del " + multiplicando);
                int multiplicador = 1;

            
                while(multiplicador <=10){
                    producto = multiplicando*multiplicador;
                    System.out.println(multiplicando + " x " + multiplicador + " = " + producto);
                    multiplicador ++;
                }
            }
        }
    }
}
