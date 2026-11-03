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
public class E4While {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, exponente, potencia;
        int x = 1;
        
        System.out.println("Introduce la base de nuestra potencia.");
        base = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce el exponente de nuestra potencia.");
        exponente = new Scanner(System.in).nextInt();
        
        potencia = base;
        
        if (exponente < 0) {
            System.out.println("El exponente no puede ser negativo.");
        } else {
            switch (exponente) {
                case 0:
                    System.out.println("Cualquier numero elevado a 0 es 1 conque el resultado es 1.");
                    break;
                case 1:
                    System.out.println("El numero introducido en la base se queda igual conque el resultado es " + base);
                    break;
                default:
                    while (x <= exponente) {
                        potencia = (potencia*base);
                        x ++ ;
                    }
                    System.out.println("El resultado de esta potencia es " + potencia);
            }
        }
    }
}
