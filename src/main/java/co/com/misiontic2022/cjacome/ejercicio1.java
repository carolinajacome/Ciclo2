package co.com.misiontic2022.cjacome;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class ejercicio1 
{
    public static void main( String[] args ){

    /** 
     {
          //llamar string
        var nombre= "Carolina";
        System.out.println(saludo(nombre));
        System.out.println( "Hello World!" );
    }
    public static String saludo (String nombre){
   return "Hey " + nombre + " !";
    }
    }
    */
    //var numero=10;
    //  System.out.println(numeroDigitos(numero));
     
    /* Segundo ejercicio
    var sc= new Scanner (System.in);

        System.out.println("Introduce un número entero");
        var numero= sc.nextInt();

        //var digitos= numeroDigitos (numero);
        //System.out.println("El número tiene "+ digitos + " cifras");
        System.out.printf("El número tiene %d  cifras \n",numeroDigitos(numero));
        sc.close();
     */   

    //Tercer Ejercicio:
    var sc= new Scanner (System.in);
    System.out.println("Introduce un número entero");
    var numero= sc.nextInt();

    var digitos= numeroDigitos(numero);
    System.out.println("El número tiene "+ digitos +" cifras");
    sc.close(); 
    }
    
    public static int numeroDigitos(int numero2){
        var cifras=0;
        while(numero2!=0){
            numero2/=10;//divide en 10 para sacar el punto
            cifras++;
        }
        return cifras;
    }
    


   
}  
    
    