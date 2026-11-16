/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E22VentasDescuentos {

    static double aplicarDescuento(double precio_total){
        double descuento;
        
        if (precio_total > 100) {
            descuento = precio_total * 0.10;
            precio_total = precio_total - descuento;
        }
        return precio_total;
    }   
    
    /**
     * 
     */
    static void calcularTotal(){
        double cantidad, producto, total_descuento;
        double total_productos = 0;
        Scanner sc = new  Scanner(System.in);
    
        System.out.print("¿Cuantos precios quieres introducir?: ");
        cantidad = sc.nextInt();
    
        while (cantidad<1) {
            System.out.print("No puedes introducir menos de 1 producto porfavor introduce la cantidad de productos:  ");    
            cantidad = sc.nextInt();
        }
    
        for (int contador = 1; contador <= cantidad; contador++) {
            System.out.print("Introduce el precio " + contador + ": ");
            producto = sc.nextFloat(); 
         
            while (producto < 0) {
                System.out.print("El precio no puede ser menor que cero vuelve a introducir el precio: ");
                producto = sc.nextFloat();     
            }
        
            total_productos = producto + total_productos;
        }
        total_descuento = aplicarDescuento(total_productos);
    
        if (total_descuento == total_productos) {
            System.out.println("El total sin descuento es: " + total_productos); 
            System.out.println("No se aplicó descuento"); 
        } else {
            System.out.println("El total sin descuento es: " + total_productos);
            System.out.println("Se aplicó descuento del 10%");
            System.out.println("El total con descuento es: " + total_descuento);
        }
    }    


    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
       calcularTotal();
    }
}
