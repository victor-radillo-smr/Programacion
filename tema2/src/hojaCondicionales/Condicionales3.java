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
public class Condicionales3 {
public static void main(String[] args) {
int dia, mes, anyo;
boolean valido = false; 
// Empezamos asumiendo que NO es válida para ahorrarnos estar poniendo valido=false en las condiciones
Scanner teclado = new Scanner(System.in);

System.out.println("Que año es: ");
anyo = teclado.nextInt();

System.out.println("Que mes es: ");
mes = teclado.nextInt();

System.out.println("Que día es: ");
dia = teclado.nextInt();

if (anyo <= 0) {
    System.out.println("El año no puede ser menor que 1");
} else if (mes <= 0 || mes > 12) {
    System.out.println("El mes no puede ser menor que 1 ni mayor que 12");
} else if (dia <= 0 || dia > 31) {
    System.out.println("El día no puede ser menor que 1 ni mayor que 31");
} else {
    switch (mes) {
        case 1, 3, 5, 7, 8, 10, 12 -> {
            if (dia >= 1 && dia <= 31) {
                valido = true;
            }
        }
        case 4, 6, 9, 11 -> {
            if (dia >= 1 && dia <= 30) {
                valido = true;
            } else {
                System.out.println("El mes seleccionado solo tiene hasta 30 días.");
            }
        }
        case 2 -> {
            boolean esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
            int diasFebrero = esBisiesto ? 29 : 28;
            
            if (dia >= 1 && dia <= diasFebrero) {
                valido = true;
            } else {
                System.out.println("Febrero no tiene tantos días en el año " + anyo);
            }
        }
    }
}

// Al final, solo comprobamos si se volvió true
if (valido) {
    System.out.println("La fecha introducida es válida");
} else {
    System.out.println("La fecha introducida no es válida.");
}
}
}