/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class E4AreaVolumen {
    
    /**
     * Esta funcion sirve para calcular el área de un cilindro.
     **/
    static void  calculaArea(){
        double radio, altura;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        
        while (radio < 1 ){
            System.out.println("ERROR el valor introducido no puede ser menor que 0 porfavor introduce el radio: ");
            radio = sc.nextInt();
        }
        
        System.out.println("Introduce el área: ");
        altura = sc.nextDouble();
        
        while (altura < 1 ){
            System.out.println("ERROR el valor introducido no puede ser menor que 0 porfavor introduce el área: ");
            altura= sc.nextInt();
        }
        
        double area = 2 * 3.14 * radio * (altura + radio);
        System.out.println("El area de el cilindro dado es de: " + area);
    }
    
    /**
     * Esta funcion sirve para calcular el volumen de un cilindro.
     **/
    static void  calculaVolumen(){
        double radio, altura;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        
        while (radio < 1 ){
            System.out.println("ERROR el valor introducido no puede ser menor que 0 porfavor introduce el radio: ");
            radio = sc.nextInt();
        }
            
        System.out.println("Introduce el área: ");
        altura = sc.nextDouble();
        
        while (altura < 1 ){
            System.out.println("ERROR el valor introducido no puede ser menor que 0 porfavor introduce el área: ");
            altura= sc.nextInt();
        }
        double volumen = 3.14 * (radio * radio) * altura;
        System.out.println("El volumen de el cilindro dado es de: " + volumen);
    }
   
   
    public static void main(String[] args) {
       
        int decision = 0;
        Scanner sc = new Scanner(System.in);
        
        while (decision != 3 ) {
            System.out.println("Menu de opciones:");
            System.out.println("    1. Área de un cilindro.");
            System.out.println("    2. Volumen de un cilindro.");
            System.out.println("    3. Salir.");
            decision = sc.nextInt();
            
            if (decision < 1 || decision > 3 ){
                System.out.println(" ");
                System.out.println("Error introduzca una opcion valida");
                System.out.println(" ");
            
                
            } else {
                switch (decision){
                    case 1:
                        calculaArea();
                        break;
                    case 2:
                        calculaVolumen();
                        break;
                    case 3:
                        System.out.println("De acuerdo el programa va a finalizar");
                        break;
                }
            }
        }
    }
}