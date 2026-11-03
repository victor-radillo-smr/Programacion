/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjercicios;

/**
 *
 * @author Alumno
 */
public class E19 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
        int total = 0;
        int numProhibido = (int)(Math.random()*6)+1;
        int dado = (int)(Math.random()*6)+1;
        
                
        System.out.println("El numero prohibido ha sido generado.");
        
        
        for ( ; dado != numProhibido ; contador ++) {
            total = total + dado; 
            System.out.println("Tirada " + contador + ": has sacado " + dado + "(total: " + total +")");
            dado = (int)(Math.random()*6)+1;
            
        }
        
        System.out.println("¡Ha salido el número prohibido (" + numProhibido + ")!");
        System.out.println("");
        System.out.println("Juego terminado.");
            
        if (contador == 0) {
            System.out.println("En la primera tirada salieron los mismos numeros conque el resultado a tiradas validas y resultado acumulado es 0");
        } else {
            System.out.println("Numero total de tiradas validas: " + contador);
            System.out.println("Total acumulado: " + total + " puntos.");
        }
    }
}
