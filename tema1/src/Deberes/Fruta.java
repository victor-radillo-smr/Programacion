/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deberes;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Fruta {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

	final float man = 2.35f;
        final float per = 1.95f;
        float ventasm, ventasp, total;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println ("Introduce la venta de manzanas en kg en este semestre: ");
        ventasm = teclado.nextFloat();
        
        System.out.println("Ahora introduce la venta de peras en kg en este semestre: ");
        ventasp = teclado.nextFloat();
        
        ventasm = ventasm * man;
        ventasp = ventasp * per;
        total = ventasm + ventasp;
        
        System.out.println("Este semestre por la venta de peras y manzanas has conseguido un beneficio total de: " + total + " €");
    }
}