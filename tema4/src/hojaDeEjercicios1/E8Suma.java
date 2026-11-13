/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;

/**
 *
 * @author Alumno
 */
public class E8Suma {

    /**
     * Funcion que suma de 2 int (sobrecargada)
     * @param num1 primer número entero
     * @param num2 Segundo número entero
     * @return devuelve la suma de 2 enteros
     */
static int suma(int num1, int num2){
    int suma;
    suma = num1 + num2;
    return suma;
}    


/**
 * Funcion que suma de 2 double (sobrecargada)
 * @param num1 primer número double
 * @param num2 Segundo número double
 * @return devuelve la suma de 2 double
 */
static double suma(double num1, double num2){
    double suma;
    suma = num1 + num2;
    return suma;
}    


/**
 * Funcion que suma de 3 double (sobrecargada)
 * @param num1 primer número double
 * @param num2 Segundo número double
 * @param num3 Tercer número double
 * @return devuelve la suma de 3 double
 */
static double suma(double num1, double num2,double num3){
    double suma;
    suma = num1 + num2 + num3;
    return suma;
}     
   

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        
        System.out.println(suma(5,10));
        System.out.println(suma(2.33,8.33));
        System.out.println(suma(2.33,4.33,10.332));
        
    }
}
