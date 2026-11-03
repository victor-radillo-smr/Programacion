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
public class E19V2 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int intentos;
        int contador = 0;
        int total = 0;
        int dado = (int)(Math.random()*6)+1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de intentos que quieres realizar: ");
        intentos = sc.nextInt();
        
        while (intentos <= 0 ){
            System.out.println("El valor introducido ha de ser mayor que 0 porfavor introduce el número de intentos que quieres realizar: ");
            intentos = sc.nextInt();
        }        
            
        int numProhibido = (int)(Math.random()*6)+1;
        System.out.println("El numero prohibido ha sido generado.");
        
        
        for ( ; dado != numProhibido && contador < intentos ; contador ++) {
            total = total + dado; 
            System.out.println("Tirada " + contador + 1 + ": has sacado " + dado + "(total: " + total +")");
            dado = (int)(Math.random()*6)+1;
            
        }
        if (contador == 0) {
            System.out.println("¡Ha salido el número prohibido (" + numProhibido + ")!");
            System.out.println("");
            System.out.println("Juego terminado.");
            System.out.println("En la primera tirada salieron los mismos numeros conque el resultado a tiradas validas y resultado acumulado es 0");
            
        } else if (dado == numProhibido) {
            System.out.println("¡Ha salido el número prohibido (" + numProhibido + ")!");
            System.out.println("");
            System.out.println("Juego terminado.");
            System.out.println("Numero total de tiradas validas: " + contador);
            System.out.println("Total acumulado: " + total + " puntos.");
            
        } else {
            System.out.println("¡No ha salido el número prohibido (" + numProhibido + ")!");
            System.out.println("Numero total de tiradas validas: " + contador);
            System.out.println("Total acumulado: " + total + " puntos.");
        }
        
    }
}
