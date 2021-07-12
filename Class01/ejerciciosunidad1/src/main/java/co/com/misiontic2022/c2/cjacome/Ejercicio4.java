/**
 * Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
    número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
    tabla y mostrar los datos.
 * 
 */
package co.com.misiontic2022.c2.cjacome;

import java.util.Scanner;

public class Ejercicio4 {
 
public void tablasdemultiplicar(){
    var n= new Scanner(System.in);
    System.out.println("Ingrese el número que desea saber la tabla de multiplicar del 0 al 10");
    var num= n.nextInt();
    n.close();


    for (int i = 0; i <=10; i++) {
        var mult= num*i;
        System.out.println(num+ "*"+ i +"="+mult);

    }
}    



}
