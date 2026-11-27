/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Alumno
 */
public class prueba {
   static Scanner sc = new Scanner(System.in);
    static int leerNumero (){
        int num = 0;
        boolean controlador = false;
        
        do{
            try {
                num = sc.nextInt();
                while (num <= 0){
                  System.out.println("Error Un array no puede tener capacidad negativa introduce un entero positivo: ");
                  num = sc.nextInt();
                }
                controlador = true;
            } catch (InputMismatchException e) {
                System.out.println("Error tienes que introducir un número entero para elegir los items de la tabla");
                sc.nextLine();
            }
        }while(!controlador);
        return num;
    }
 
}
       