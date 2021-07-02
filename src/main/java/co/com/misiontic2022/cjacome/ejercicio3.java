//Escribe un programa Java que lee un número entero por teclado y obtiene y
//muestra por pantalla el doble y el triple de ese número.

package co.com.misiontic2022.cjacome;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        
        var dato= new Scanner (System.in);
        System.out.println("Introduce un número entero");
        var numero= dato.nextInt();
        
        var doble= numerodoble(numero);
        var triple= numerotriple(numero);
        System.out.println("El doble del número  " +numero +" es "+ doble +" Y el triple es  " + triple);
        dato.close(); 

    }

    public static int numerodoble(int numero){   
        var doble = numero*numero;
        return doble;
    } 

    public static int numerotriple(int numero){
        var triple=numero*numero*numero;
        
        return triple;
    }
}
