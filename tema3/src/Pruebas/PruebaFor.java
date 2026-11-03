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
public class PruebaFor {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        //ESTA VERSION ES PARA HACER UNA CUENTA ASCENDENTE A PARTIR DE UN NÚMERO INTRODUCIDO POR EL USUARIO
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número.");
        int n =sc.nextInt();
        
        for (int i = 1; i <= n; i++)
            System.out.println(i);
        */
        
        //Y ESTA VERSION ES PARA HACER UNA CUENTA DESCENDENTE
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número.");
        int n =sc.nextInt();
        
        for (int i = n; i != 0; i--)
            System.out.println(i);
    }
}
