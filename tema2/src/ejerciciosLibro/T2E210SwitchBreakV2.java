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
public class T2E210SwitchBreakV2 {
public static void main(String[] args) {
// TODO code application logic here
int nota;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la nora del alumno: ");
nota = teclado.nextInt();

    switch (nota) {
        case 0:
            System.out.println("Insuficiente."); 
            break;
            
        case 1:
            System.out.println("Insuficiente."); 
             break;
             
        case 2:
            System.out.println("Insuficiente."); 
             break;
             
        case 3:
            System.out.println("Insuficiente."); 
             break;
             
        case 4:
            System.out.println("Insuficiente."); 
             break;
             
        case 5:
            System.out.println("Suficiente.");
             break;
             
        case 6:
            System.out.println("Bien.");
             break;
             
        case 7:
            System.out.println("Notable.");
             break;
             
        case 8:
            System.out.println("Notable."); 
             break;
             
        case 9:
            System.out.println("Sobresaliente.");
             break;
             
        case 10:
            System.out.println("Sobresaliente.");
             break;
             
    default: System.out.println("Valor introducido incorrecto.");
    }
}
}