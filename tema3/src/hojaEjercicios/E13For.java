/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjercicios;

/**
 *
 * @author Alumno
 */
public class E13For {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicando = 1;
        int producto;
    
        for ( ; multiplicando <= 10 ; multiplicando ++){
            System.out.println("Esta es la tabla del " + multiplicando);
            int multiplicador = 1;
            
            while(multiplicador <=10){
                producto = multiplicando*multiplicador;
                System.out.println(multiplicando + " x " + multiplicador + " = " + producto);
                multiplicador ++;
            }
        }
    }
}
