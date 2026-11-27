package hojaDeEjercicios1;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class E5MaximoValor {
    
    static int maximo(int t[]){
        int num = t[t.length-1];
           
            for(int i = (t.length - 1) ; i >= 0  ; i-- ){
                if (num <= t[i]){
                    num = t[i];    
                }         
            }
            return num;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla[] = null;
        boolean condicion = false;
        int longitud;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la longitud que quieres que tenga nuestro array: ");
        
        do {            
            try {
                longitud = sc.nextInt();
                tabla = new int [longitud];
                condicion = true;
            } catch (InputMismatchException e) {
                System.out.println("Este array solo admite numeros enteros porfavor introduce un entero positivo: ");
                sc.nextLine();
            }catch  (NegativeArraySizeException e){
                System.out.println("Un array no puede contener una cantidad negativa de objetos porfavor introduce un entero positivo: ");
                sc.nextLine();
            }
        } while (!condicion);
        
        for (int i = 0; i < tabla.length; i++) {
            tabla [i] = [sc.nextInt()];
        }
        int numero = maximo(tabla);
        System.out.println("Este es el valor máximo que tiene el array: " + numero);
    }
}
