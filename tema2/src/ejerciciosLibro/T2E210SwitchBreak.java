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
public class T2E210SwitchBreak {
public static void main(String[] args) {
// TODO code application logic here
int nota;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la nora del alumno: ");
nota = teclado.nextInt();

    switch (nota) {
        case 0,1,2,3,4:
            System.out.println("Insuficiente.");
            break;
    }switch (nota){ 
        case 5:
            System.out.println("Suficiente.");
            break;
    }switch (nota) {
        case 6:
            System.out.println("Bien.");
            break;
    }switch (nota) {
        case 7,8:
            System.out.println("Notable.");
            break;
    }switch (nota) {
        case 9,10:
            System.out.println("Sobresaliente.");
            break;
    default: System.out.println("Valor introducido incorrecto.");
    }
}
}