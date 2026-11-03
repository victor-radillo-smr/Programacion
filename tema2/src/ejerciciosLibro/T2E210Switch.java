/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosLibro;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class T2E210Switch {
public static void main(String[] args) {
// TODO code application logic here
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la nora del alumno: ");
int nota = teclado.nextInt();
switch (nota) {
    case 0, 1, 2, 3, 4 ->
        System.out.println("Insuficiente");
    case 5 ->
        System.out.println("Suficiente");
    case 6 ->
        System.out.println("Bien");
    case 7, 8 ->
        System.out.println("Notable");
    case 9, 10 ->
        System.out.println("Sobresaliente");
    default ->
        System.out.println("Error: nota no válida");
}
    }
}