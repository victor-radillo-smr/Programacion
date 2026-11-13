/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class potencia {

    /**
     * Funcion para hacer una potencia a partir de una base y un exponente
     * entregado por el usuario la cual devuelve el resultado
     * @param base base de la potencia entregada por elusuario tipo int
     * @param exponente exponente de la potencia entregado por elusuario tipo int
     * @return resultado de la potencia tipo int
     */
    public static int potencia(int base, int exponente) {
        int resultado = base;
        for(int x = 1 ; x < exponente ; x++) {
            resultado = (resultado*base);
        }    
        return  resultado;
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, exponente, resultado;
        
        System.out.println("Introduce la base de nuestra potencia.");
        base = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce el exponente de nuestra potencia.");
        exponente = new Scanner(System.in).nextInt();
        
        
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
                   resultado = potencia (base, exponente);
                    System.out.println("El resultado de esta potencia es " + resultado);
            }
        }
    }
}
