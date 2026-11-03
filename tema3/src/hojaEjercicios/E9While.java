package hojaEjercicios;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class E9While {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int resto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();

        while (num <= 0){
            System.out.println("ERROR tienes que introducir un número positivo porfavor introduce otro número.");
            num = teclado.nextInt();
        }   
        while (num > 0) {
            resto = num % 10;
            System.out.println(resto);
            num = num / 10;
        }
    System.out.println("Fin del programa.");
    }
}

