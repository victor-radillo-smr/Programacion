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
public class Condicionales10 {
public static void main(String[] args) {
// TODO code application logic here

    int numero;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduce un numero: ");
    numero = teclado.nextInt();
    
    int valorAbsoluto = (numero < 0) ? -numero : numero;
    
    System.out.println("El valor absoluto del numero introducido es: " + valorAbsoluto);
}
}
