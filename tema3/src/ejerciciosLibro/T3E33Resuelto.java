/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosLibro;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class T3E33Resuelto {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte numeroSecreto  = (byte) (Math.random() * 100 + 1); 
        byte num;
        Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce un número entre 1 y 100 para empezar a jugar (para rendirte introduce -1):");
            num =teclado.nextByte();

                while (num != -1 && num != numeroSecreto) {
                    if (num  > 0) {
                        if(num > numeroSecreto) {
                            System.out.println("Menor.");
                            num =teclado.nextByte();
                        }
                        if(num < numeroSecreto) {
                            System.out.println("Mayor.");
                            num =teclado.nextByte();
                        }
                    } else {
                         System.out.println("ERROR el numero intrioducido tiene que estar entre 1 y 100 (para rendirte introduce -1).");
                         num =teclado.nextByte();
                     }
                }
                if (num == numeroSecreto) {
                    System.out.println("Enhorabuena has ganado el número secreto era " + numeroSecreto + ".");
                } else {
                    System.out.println("El número secreto era " + numeroSecreto + " mejor suerte la proxima vez.");
                }
  
            }
        }