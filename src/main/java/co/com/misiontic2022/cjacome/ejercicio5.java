/*Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si la variable es par o impar.
Utiliza el operador condicional ( ? : ) para resolverlo.
resultado = (condicion)?valor1:valor2;
Ej: “14 es par” o “15 es impar
*/
package co.com.misiontic2022.cjacome;

//import java.util.Scanner;

public class ejercicio5 {   
    
    public static void main(String[] args) {
       
        System.out.println(resultado(15));
        
    }
    public static int resultado (int numero){
      
        var res= (numero%2==0)? "es par": "es impar";
        var conv=Integer.parseInt(res);
        return  conv;
        
    }
}
 // var datoN= new Scanner(System.in);
    // System.out.println("Ingrese un número para saber si es par o impar");
       // var numero = datoN.nextInt();
       // var  resultado2=(numero%2==0)? " es par": " es impar";
       //var  resultado2=(numero%2==0)? " es par": " es impar";
        //System.out.println("El número "+ numero + resultado2);
        //datoN.close();
        //var res= (numero2%2==0)? "es par": "es impar";