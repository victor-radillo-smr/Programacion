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
public class E17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS EL NÚMERO
        System.out.println("Introduce el número para dibujar el arbol de navidad: ");
        num = sc.nextInt();
        
        //CON ESTE FOR MEDIMOS EL NÚMERO DE VUELTAS
        for ( ; num > 0 ; num --){
            //CON ESTE FOR MEDIMOS EL NÚMERO DE ESPACIOS
            for ( int espacios =  num - 1  ; espacios > 0 ; espacios --){
                System.out.print(" ");
            }
            //CON ESTE FOR MEDIMOS EL NÚMERO DE ASTERISCO DIBUJADOS
            for (int asterisco = 1 ; asterisco <= contador ; asterisco ++) {
                System.out.print("* ");
            }
            //Y CON ESTAS DOS LINEAS SALTAMOS DE LINEA Y INCREMENTAMOS EL
            //CONTADOR PARA AUMENTAR EL NÚMERO DE ASTERISCOS DIBUJADOS POR FILA
            System.out.println();
            contador ++;
        }
    }
}