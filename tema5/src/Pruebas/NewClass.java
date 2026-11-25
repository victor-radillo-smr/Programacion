/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class NewClass {
    // hacer un programa que solicite las notas ded las 3 evaluaciones de un alumno 
    //las guarde en un array y si la media de las calificaciones es superior a 8 modifique el array sumando un punto a cada una de las notas almacenadas
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        float nota;
        boolean condicion = false;
        Scanner sc = new Scanner(System.in);
        float evaluacion[] = new float [3];
       
        do {                
            try {
                for (int i = 0; i<evaluacion.length ; i++) {
                    System.out.print("Dame la " + (i + 1) + "º nota del alumno: "); 
                    nota = sc.nextFloat();
                
                    while (nota <0 || nota> 10) {                    
                        System.out.println("La nota del alumno tiene que estar comprendida entre 0 y 10: ");
                        nota = sc.nextFloat();
                    }
                    evaluacion [i] = nota;
                }
                condicion = true; 
                
            } catch (InputMismatchException e) {
                System.out.println("Error La nota del alumno debe ser un número."); 
                sc.nextLine();
            }
        }while (!condicion);
        
        double media = (evaluacion[0] + evaluacion [1]+ evaluacion [2]) / evaluacion.length;
        
        if (media >= 8){
            System.out.println("Esta es la media del alumno: " + media );
            System.out.println("Al haber superado la media del 8  se incrementaran cada una de sus notas en un punto y se volvera a hacer la media.");
            
            for (int i = 0; i < evaluacion.length; i++) {
                evaluacion [i] += 1 ;
            }
          
            media = (evaluacion[0] + evaluacion [1]+ evaluacion [2])/evaluacion.length;
            
            if (media> 10) {
                System.out.println("Al haber superado la media del 8 pero al ver que tu media superaria el 1 se ha fijado tu media en: 10 ");
                
            }else{
            System.out.println("Al haber superado la media del 8 despues de haber incrementado esta es la media del alumno: " + media);
            }
            
        } else {
            System.out.println("Esta es la media del alumno: " + media);
        }
    }
}
