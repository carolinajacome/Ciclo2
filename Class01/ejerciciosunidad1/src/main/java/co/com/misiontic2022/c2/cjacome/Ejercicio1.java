package co.com.misiontic2022.c2.cjacome;

import java.util.Scanner;

/**
 *  Realizar la suma, la resta, la división y la multiplicación de dos números
    leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
    y <número 2> es igual a <resultado> ”.
 * 
 */
public class Ejercicio1 
{

   public  void   suma(){
      

      var n= new Scanner(System.in);
      System.out.println("Ingrese el número 1 ");
      var num1= n.nextInt();

      System.out.println("Ingrese el número 2 ");
      var num2= n.nextInt();

      

      var suma= num1+num2;
      var resta= num1-num2;
      var rest2= num2-num1;
      var mult= num1*num2;
      var división= num1/num2;

      System.out.println("La suma de "+ num1+ " y " +num2 +" es "+ suma);
      System.out.println("La resta de "+ num1+ " y " +num2 +" es "+ resta);
      System.out.println("La resta de "+ num2+ " y " +num1 +" es "+ rest2);
      System.out.println("La multiplicación de "+ num2+ " y " +num1 +" es "+ mult);
      System.out.println("La división de "+ num1+ " y " +num2 +" es "+ división);

      n.close();

   }
}

