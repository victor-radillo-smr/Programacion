/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaCondicionales;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Condicionales7 {
public static void main(String[] args) {
// TODO code application logic here   

int numero_dni, operacion_letra;
char letra;

Scanner teclado = new Scanner(System.in);

System.out.println("Introduce tu numero de DNI el cual debe tener 8 digitos");
numero_dni = teclado.nextInt();

    if (0 > numero_dni || numero_dni > 99999999) {
        System.out.println("ERROR número introducido inviable reinicie el programa.");
    }else{
        operacion_letra = numero_dni % 23;
        
        if (operacion_letra == 0) {
            letra = 'T';
            
        }else if(operacion_letra == 1){
            letra = 'R';
            
        }else if(operacion_letra == 2){
            letra = 'W';
            
        }else if(operacion_letra == 3){
            letra = 'A';
            
        }else if(operacion_letra == 4){
            letra = 'G';
            
        }else if(operacion_letra == 5){
            letra = 'M';
            
        }else if(operacion_letra == 6){
            letra = 'Y';
            
        }else if(operacion_letra == 7){
            letra = 'F';
            
        }else if(operacion_letra == 8){
            letra = 'P';
            
        }else if(operacion_letra == 9){
            letra = 'D';
            
        }else if(operacion_letra == 10){
            letra = 'X';
            
        }else if(operacion_letra == 11){
            letra = 'B';
            
        }else if(operacion_letra == 12){
            letra = 'N';
            
        }else if(operacion_letra == 13){
            letra = 'J';
            
        }else if(operacion_letra == 14){
            letra = 'Z';
            
        }else if(operacion_letra == 15){
            letra = 'S';
            
        }else if(operacion_letra == 16){
            letra = 'Q';
            
        }else if(operacion_letra == 17){
            letra = 'V';
            
        }else if(operacion_letra == 18){
            letra = 'H';
            
        }else if(operacion_letra == 19){
            letra = 'L';
            
        }else if(operacion_letra == 20){
            letra = 'C';
            
        }else if(operacion_letra == 21){
            letra = 'K';
            
        }else{
            letra = 'E';    
        }
        System.out.println("La letra de tu DNI es: " + letra);
    
    }


}
}