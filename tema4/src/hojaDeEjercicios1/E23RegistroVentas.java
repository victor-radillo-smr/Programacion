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
public class E23RegistroVentas {
    
    static void mostrarMenu(){
        System.out.println("==== MENÚ DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver número de ventas");
        System.out.println("4. Salir");
        System.out.println(" ");
        System.out.print("Selecciona una opcion: ");
        System.out.println(" ");
    }

    /**
     * Funcion que añade una venta y devuelve el valor de la venta
     * @return devuelve el valor de la venta que se quiere registrar
     */
    static double agregarVenta(){
        double valor_venta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de la venta: ");
        valor_venta = sc.nextDouble();

        while (valor_venta < 0){
            System.out.println("El valor no puede ser negativo porfavor introduce un valor valido: ");
            valor_venta = sc.nextDouble();            
        }
        return valor_venta;
    }

    /**
     * Funcion que imprime el total acumulado.
     */
    static void mostrarTotalVentas(double b){
        System.out.println("El total acumulado de ventas es: " + b + "€");
        System.out.println(" ");
    }
    
    /**
     * Funcion que imprime el número de ventas
     */
    static void mostrarNumeroVentas(int a){
        System.out.println("Se han registrado " + a + " ventas");
        System.out.println(" ");
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        int eleccion;
        double suma = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        mostrarMenu();
        eleccion = sc.nextInt();
        while (eleccion != 4){

            while (eleccion < 1 || eleccion > 4){
                System.out.println(" ");
                System.out.println("Porfavor introduce una de las opciones dadas; ");
                System.out.println(" ");
                eleccion = sc.nextInt();
            }

            switch (eleccion){
                    case 1:
                        suma = suma + agregarVenta();
                        contador ++;
                        break;
                    case 2:
                        mostrarTotalVentas(suma);
                        break;
                    case 3:
                        mostrarNumeroVentas(contador);
                        break;
            }
        }
        System.out.println("Saliendo del programa.");
    }
}