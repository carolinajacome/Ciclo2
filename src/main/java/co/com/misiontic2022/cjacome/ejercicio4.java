/*
Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
*/


package co.com.misiontic2022.cjacome;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        var datoC= new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de grados centigrados a convertir");
        var centigrados= datoC.nextFloat();
        var faren= convertirFarenheit(centigrados);
        

        System.out.println("La cantidad de grados "+ centigrados + "° es "+ faren +"ºF");
       
        datoC.close();
    }

    public static float convertirFarenheit (float centigrados){

        var faren = 32+ (9 *(centigrados/5));
        return faren;
    }
    
}
