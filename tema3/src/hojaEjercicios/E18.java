/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjercicios;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E18 {
 /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int principio, fin;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el numero por el que empezara el rango.");
        principio = sc.nextInt();

        System.out.println("Dame el número en el que finalizara el rango.");
        fin = sc.nextInt();

        for (int rango = principio; rango <= fin; rango++) {

            boolean esPrimo = true;

            if (rango < 2) {
                esPrimo = false;
            }

            for (int divisor = 2; divisor < rango; divisor++) {

                if (rango % divisor == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(rango + ", ");
            }
        }
    }
}
