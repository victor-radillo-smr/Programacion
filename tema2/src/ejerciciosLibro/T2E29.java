package ejerciciosLibro;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */

public class T2E29 {
public static void main(String[] args) {
// TODO code application logic here
int num;
Scanner teclado = new Scanner(System.in);
    
System.out.println("Introduce un número entre el 0 y 99999: ");
num = teclado.nextInt();

    if (num < 0) {
        System.out.println("El número " + num + " Esta por debajo de 0 y este programa solo mide números entre 0 y 99999.");
    } else if (num < 10) {
        System.out.println("El número " + num + " tiene una cifra.");
    } else if (num < 100){
        System.out.println("El número " + num + " tiene dos cifras.");
    } else if (num < 1000){
        System.out.println("El número " + num + " tiene tres cifras.");
    } else if (num < 10000){
        System.out.println("El número " + num + " tiene cuatro cifras.");
    } else if (num < 100000){
        System.out.println("El número " + num + " tiene cinco cifras.");
    }else{
        System.out.println("Este programa solo mide hasta el numero 99999.");
    }
        
                                    }
        
                }
