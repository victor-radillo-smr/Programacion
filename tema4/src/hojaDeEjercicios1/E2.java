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
public class E2 {
/**
 * La funcion muestraRango muestra el rango comprendido entre los números enteros num1 y num2
 */
    public static void muestraRango(){
        int num1, num2, mayor, menor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número por el que empezara el rango: ");
        num1 =sc.nextInt();
        
        System.out.println("Introduce el número por el que acabara el rango: ");
        num2 =sc.nextInt();
        
        if (num1>num2) {
            mayor = num1;
            menor =num2;
        } else {
            mayor = num2;
            menor =num1;
        }
        
        for (int rango = menor ; rango <= mayor ; rango++){
            if (rango == num2){
                System.out.println(rango + ".");
            } else {
                System.out.print(rango + ", ");
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        muestraRango();
    }
}