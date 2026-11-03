/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class T2E214 {
public static void main(String[] args) {
// TODO code application logic here

int dia,mes, anyo, dia_mes, febrero;
Scanner teclado = new Scanner(System.in);

System.out.println("Dame el numero de dia del mes: ");
dia = teclado.nextInt();
    if (dia < 0 || dia > 31) {
        System.out.println("ERROR Dato introducido inviable");
        
    }else{
    System.out.println("Dame el numero de mes del año: ");
    mes = teclado.nextInt();
        if (mes < 0 || mes > 12) {
           System.out.println("ERROR Dato introducido inviable");
        }else{
        System.out.println("Dame el año: ");
        anyo = teclado.nextInt();
            if (anyo < 0) {
                System.out.println("ERROR Dato introducido inviable");
            }else{
        dia_mes = switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12->{
                     yield 31;
                    }
                    case 4, 6, 9, 11->{
                     yield 30;   
                    }
                    case 2->{
                        
                    }   
                    }
                    
                    
                
            }
            if (dia > 1 && dia < dia_mes) {
                dia ++;
                System.out.println(dia + "/" + mes + "/" + anyo);
            }else{
                mes++;
                dia = 1;
                if (mes > 0 && mes < 12) {
                    System.out.println(dia + "/" + mes + "/" + anyo);
                }else{
                    anyo++;
                    System.out.println(dia + "/" + mes + "/" + anyo);
                    
    
}
        }
            }
        }
    }
}
}