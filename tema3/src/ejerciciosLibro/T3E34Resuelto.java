/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosLibro;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class T3E34Resuelto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int alturaAlto, altura;
        int IDALTO = 0;
        int CONTADOR = 0;
        Scanner teclado = new Scanner(System.in);
 
            System.out.println("Introduce la altura de un arbol: ");
            altura = teclado.nextInt();
            alturaAlto = altura;
    
            while (altura != -1) {
            System.out.println("Introduce la altura de otro arbol: ");
            altura = teclado.nextInt();

                if (altura < 0 && altura != -1) {
                    System.out.println("ERROR la altura no puede ser negativa.");
                } else {
                    CONTADOR ++;
                    if (alturaAlto < altura) {
                        alturaAlto = altura;
                        IDALTO = CONTADOR;
                    }
                }
            }
        System.out.println("El arbol con id " + IDALTO + " el cual tiene una altura de " + alturaAlto + " cm es el mas alto.");
    }
}