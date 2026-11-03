package myproject2;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class myproject2 {
        public static void main(String[] args) {
            
System.out.print("Introduce tu edad actual: ");
byte edad;
Scanner teclado = new Scanner(System.in);
edad = teclado.nextByte();
edad = ++ edad;
System.out.print("Tu edad el año que viene sera de: " + edad + " años.");

}
}
