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
public class T2E210 {
public static void main(String[] args) {
// TODO code application logic here
int nota;
Scanner teclado = new Scanner(System.in);

System.out.println("Introduce la nora del alumno: ");
nota = teclado.nextInt();

    if (nota < 0) {
        System.out.println("No se puede introducir un valor inferior a 0.");
    }else if (nota == 5) {
        System.out.println("Suficiente.");
    }else if (nota == 6) {
        System.out.println("Bien.");
    }else if (nota == 10 || nota == 9 ){
        System.out.println("Sobresaliente");
    }else if (nota == 8 || nota == 7){
        System.out.println("Notable.");
    }else if (nota <= 4) {
        System.out.println("Insuficiente.");
    } else {
            System.out.println("No se puede introducir un valor superior a 10.");
        
    }
}
}