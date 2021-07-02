//package co.com.misiontic2022.cjacome;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        var sc= new Scanner (System.in);
        System.out.println("Introduce un número entero");
        var numero= sc.nextInt();

        var digitos= numeroDigitos(numero);
        System.out.println("El número tiene "+ digitos +" cifras");
        sc.close();

    }
    public static int numeroDigitos(int numero) {
        var cifras=0;

        while(numero!=0){
            numero/=10;
            cifras++;
        }
        return cifras;
    }
    
}
