/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E3OrdenInverso2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean controlador1 = false;
        boolean controlador2 = false;
        int i = 0;
        int num = 0;
        int tabla1[] = null ; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa sirve para rellenar una array. " );
        System.out.println("");
        System.out.print("Dame el número de items que quieres que haya en el array (recuerda que son números enteros):");
       
        do{
            try {
                num = sc.nextInt();
                tabla1 = new int [num];
                controlador1 = true;
            } catch (InputMismatchException e) {
                System.out.println("Error tienes que introducir un número entero para elegir los items de la tabla");
                sc.nextLine();
            } catch (NegativeArraySizeException e){
                System.out.println("Error Un array no puede tener capacidad negativa introduce un entero positivo: ");
                sc.nextLine();
            }
        }while(!controlador1);
        
        System.out.println("");
        System.out.println("Bien ha escogido una lista de " + num + " elementos ");
        System.out.println("");
       
        for( ; i<num ; i++){
            do{
                System.out.print("Ahora introduce el valor del entero en " + (i + 1) + "º posicion: ");
                try{
                    tabla1 [i] = sc.nextInt();
                    controlador2 = true;
                }catch (InputMismatchException e){
                    System.out.println("Error Debes introducir un dato de tipo entero: ");
                    sc.nextLine();
                }
            }while (!controlador2);
        }
        for(i = (num - 1) ; i>=0 ; i--){
            if (i>0){
                System.out.print(tabla1[i] + ", ");
            } else {
                System.out.println(tabla1[i]);
            }
        }
    }
}