/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaEjercicios;

/**
 *
 * @author Alumno
 */
public class E22 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int puntoRuptura = (int)(Math.random() * 4) + 7;
        int estiramiento = 0;
        
        System.out.println("El punto de ruptura es ... " + puntoRuptura);
        System.out.println();
        
        while (estiramiento < puntoRuptura) {
            estiramiento = (int)(Math.random() * 10) + 1;
            
            for (int asterisco = 1 ; asterisco <= estiramiento ; asterisco ++) {
                System.out.print("* ");    
            }
            
            System.out.println("   estiramiento = " + estiramiento );
	    }
	  System.out.println("");
	  System.out.println("La cuerda se ha roto con el estiramiento = " + estiramiento);
	  System.out.println("");
	  System.out.println("Fin de programa");
    }
}