/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaDeEjercicios1;

/**
 *
 * @author Alumno
 */
public class E20DiferenciaHoras {

    /**
     * Funcion que suma de 2 int (sobrecargada)
     * @param num1 primer número entero
     * @param num2 Segundo número entero
     * @return devuelve la suma de 2 enteros
     */
static int diferenciaHoras(int hora1, int minuto1, int hora2, int minuto2){
    int operacion1, operacion2;
    
    if (hora1>hora2){
        operacion1 = hora1 - hora2;
    } else {
        operacion1 = hora2 - hora1;
    }
        if (minuto1>minuto2){
        operacion2 = minuto1 - minuto2;
    } else {
        operacion2 = minuto2 - minuto1;
    }
        
     operacion1 = operacion1 * 60;
     return operacion1 + operacion2;
}    


    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        
    
        System.out.println(diferenciaHoras());
        
    }
}
