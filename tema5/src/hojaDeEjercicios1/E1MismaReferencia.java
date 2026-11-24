/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class E1MismaReferencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t1[] = {0,1,2,3,4,5,6,7,8,9};
        int t2[] = new int[10];
    
        t2 = t1;
       
        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        
        System.out.println(t1);
        System.out.println(t2);

    }
}