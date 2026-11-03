/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaCondicionales;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Condicionales6 {
public static void main(String[] args) {
// TODO code application logic here

int aforo, entradas_vendidas;
double precio_entrada, total_descuento, descuento, cancelar, aforo_Descuento, beneficios;
float DESCUENTO_APLICABLE = 0.25f;

Scanner teclado = new Scanner(System.in);

System.out.println("Introduce el aforo maximo del local: " );
aforo = teclado.nextInt();

System.out.println("Introduce el precio por entrada: ");
precio_entrada = teclado.nextDouble();

System.out.println("Introduce cuantas entradas de han vendido: ");
entradas_vendidas = teclado.nextInt();

 cancelar = (aforo * 0.20);
 aforo_Descuento = (aforo * 0.5);

    if (entradas_vendidas < cancelar ) {
    System.out.println("El conciero tiene que cancelarse.");

    } else if (entradas_vendidas <= aforo_Descuento){
    descuento = precio_entrada * DESCUENTO_APLICABLE;
    total_descuento = precio_entrada - descuento;
    System.out.println("El precio de las estradas ha sido rebajado un 25 % debido a que la venta no ha superado el 50% del aforo permitido y han pasado a valer " + total_descuento + " €");
    
    beneficios = total_descuento * entradas_vendidas;
    System.out.println("Los beneficios totales del concierto han sido: " + beneficios + " €");

    } else {
    
    beneficios = precio_entrada * entradas_vendidas;
    System.out.println("Los beneficios totales del concierto han sido: " + beneficios + " €");
    }
}
}