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
public class T1E119 {     /**
* @param args the command line arguments
*/
    public static void main(String[] args) {
    // TODO code application logic here
    
    final float PRECIOINFANTIL = 15.50f;
    final float PRECIOADULTO = 20f;
    final float DESCUENTO = 0.05f;
    float total, precioFin, descuentoAplicable;
    byte entradaInfantil, entradaAdulto;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Cuantas entradas infantiles va a querer?: ");
    entradaInfantil = teclado.nextByte();

    System.out.println("Cuantas entradas generales va a querer?: ");
    entradaAdulto = teclado.nextByte();

    total = entradaAdulto * PRECIOADULTO + entradaInfantil * PRECIOINFANTIL;

    if (total >= 100){
        descuentoAplicable = total * DESCUENTO;
        precioFin = total - descuentoAplicable;

        System.out.println("El precio total con el descuento del 5% ya que ha gastado mas de 100€ es de: " + precioFin + " €");
    }else{
        System.out.println("El precio total es de: " + total + " €");    
    }
    }
}
