import java.util.Scanner;

/**
 * HolaQuien
 */
public class HolaQuien {
     public static void main(String[] args) {
         var sc= new Scanner (System.in);
         System.out.println("Por favor ingrese su nombre");
         var nombre= sc.nextLine();
         sc.close();
         System.out.println("Hola "+ nombre + " !");
     }
    
}