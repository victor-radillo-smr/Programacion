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
public class E12While {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        int aprobados = 0;
        int suspensos = 0;
        int condicionados = 0;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        
        
        for ( ; contador != 6 ; contador++ ){
            System.out.println("Introduce la nota del " + contador + " alumno:" );
            nota = teclado.nextInt();

                if (nota >= 5 ) {
                    aprobados ++;
                
                } else if (nota == 4) {
                    condicionados++;
                
                } else {
                    suspensos ++;
                }
        }
        if (contador == 6) {
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Condicionados: " + condicionados);
            System.out.println("Suspensos: " + suspensos);
            
        }
    }
}
