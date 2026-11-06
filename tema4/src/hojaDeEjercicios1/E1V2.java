/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E1V2 {

    /**
     * La funcion operacionSuma devuelve el resultado de la suma de dos números a partir de dos dados por el usuario.
     **/
    static void operacionSuma (){
        int a,b, resultado;
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el primer número para su suma");
        a = sc.nextInt();
                
        System.out.println("Dame el primer número para su suma");
        b = sc.nextInt();
        
        resultado = a + b;
        
        System.out.println("La suma de "+ a + " + " + b + " es " + resultado );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operacionSuma();
    }
    
}
