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
public class E3AreaVolumen {
/**
 * La funcion muestraRango muestra el rango comprendido entre los números enteros num1 y num2
 */
    static void areaVolumenCilindro (){
        int decision;
        double radio, altura;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 1 para calcular el área o 2 para calcular el volumen: ");
        decision = sc.nextInt();
        
        while (decision < 1 || decision > 2){
            System.out.println("ERROR se debe introducir 1 para el área o 2 para el volumen introduzca una opcion valida: ");
            decision = sc.nextInt();
        }
        
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
    
    if (decision == 1){
        double area = 2 * 3.14 * radio * (altura + radio);
        System.out.println("El area de el cilindro dado es de: " + area);
    } else {
        double volumen = 3.14 * (radio * radio) * altura;
        System.out.println("El volumen de el cilindro dado es de: " + volumen);
    }
    }
    
    public static void main(String[] args) {
        areaVolumenCilindro();
	}
}