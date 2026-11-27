/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E3OrdenInverso {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean controlador1 = false;
        boolean controlador2 = false;
        int num;
        int tabla1[]; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa sirve para rellenar una array. " );
        System.out.println("");
        System.out.print("Dame el número de items que quieres que haya en el array (recuerda que son números enteros):");
       
        do{
            try {
                num = sc.nextInt();
                tabla1 = new int [num];
                controlador1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Error tienes que introducir un número entero para elegir los items de la tabla");
                sc.nextLine();
            } catch (NegativeArraySizeException e){
                System.out.println("Error Un array no puede tener capacidad negativa introduce un entero positivo: ");
                sc.nextLine();
            }
        }while(!controlador1);
        
        
        
    }
}
