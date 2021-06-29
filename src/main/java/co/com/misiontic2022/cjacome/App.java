package co.com.misiontic2022.cjacome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //llamar string
        var nombre= "Carolina";
        System.out.println(saludo(nombre));
        //System.out.println( "Hello World!" );
    }
    public static String saludo (String nombre){
        return "Hey " + nombre + " !";
    }
}
