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
public class E20 {
        /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horas, minutos, segundos, incremento;
        Scanner sc = new Scanner(System.in);
    
        // Pedimos una hora y validamos que este en el rango de horas validas
        System.out.println("dame una hora: ");
        horas = sc.nextInt();
    
        while (horas < 0 || horas > 23) {
            System.out.println("La hora introducida no es valida dame una hora valida: ");
            horas = sc.nextInt();
        }
        
        // Pedimos unos minutos y validamos que este en el rango de minutos validos
        System.out.println("dame los minutos: ");
        minutos = sc.nextInt();
    
        while (minutos < 0 || minutos > 59) {
            System.out.println("Los minutos introducidos no son validos dame unos minutos validos: ");
            minutos = sc.nextInt();
        }
    
        // Pedimos unos segundos y validamos que este en el rango de segundos validos
        System.out.println("dame los segundos: ");
        segundos = sc.nextInt();
    
        while (segundos < 0 || segundos > 59) {
            System.out.println("Los segundos introducidos no son validos dame unos segundos validos: ");
            segundos = sc.nextInt();
        }
    
        // Confirmamos la hora que nos ha dado y pedimos al usuario cuantos segundos quiere que incrementemos
        System.out.println("Dime cuantos segundos deseas incrementar el reloj que me has dado " + horas + ":" + minutos + ":" + segundos);
        incremento = sc.nextInt();
    
        segundos = segundos + incremento;
        
        for ( ; incremento > 59 ; incremento = incremento - (segundos - 60)) {
            if (segundos > 59) {
                segundos = 0;
                minutos ++;
            
	        } else if (minutos > 59) {
	            minutos = 0;
	            horas++;
	        
	        } else if (horas > 23){
	            horas = 0;
            }
        }
        System.out.println("La hora despues de aplicar el incremento es " + horas + ":" + minutos + ":" + segundos);
    }
}

