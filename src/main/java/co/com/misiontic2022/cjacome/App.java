/*
2.Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado
*/
package co.com.misiontic2022.cjacome;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       
/**
        try {
           System.out.println();
       }
       catch (Exception e){
        System.err.println("Excepción");
        e.printStackTrace();
       }

       
    */  
    /**9*/ // hallarmayor();
    /*10*/  //comprobarHora();
    /*11*/ //asignarMeses();
    /*12*/ mostrarNomultiplosdetres();
        //dividirendos();
        //comprobarMayuscula ();
        //calcularIVA();
        //eliminarCifras();
    
    }
    
    public static Double calcularIVA()
    {
       
        Scanner sc = new Scanner(System.in);
        double precioUnidad, cantidad, iva, precioSinIva, totalIva,precioTotal;

        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca la cantidad de productos vendidos: ");
        cantidad = sc.nextDouble();
        
        System.out.print("Introduzca el % de IVA: ");
        iva = sc.nextDouble();
        sc.close();
        precioSinIva = precioUnidad * cantidad;
        totalIva = precioSinIva* (iva/100) ;
        precioTotal= precioSinIva+totalIva;
        System.out.println("El precio del producto es de  $" + precioTotal);  
        
        return totalIva;
        
    }                        
   
    public static int eliminarCifras(){
        Scanner sc= new Scanner (System.in);
        int numero1, cantcifras;

        System.out.println("Ingrese el Número:  N");
        numero1= sc.nextInt();
        var numero1_S= String.valueOf(numero1);

       // String numero1_str = Integer.toString( numero1);
        //int new_x = Integer.parseInt(numero1_str12.substring(3));
        System.out.println("Ingrese la cantidad de cifras a eliminar: m");
        cantcifras= sc.nextInt();
        
        //var cantidad= numeroDigitos(numero1);
        var fin= eliminarPos(numero1_S, cantcifras);
        var fin_Int = Integer.parseInt(fin);
        sc.close();
        
        
        System.out.println("Se han elim1inado "+ cantcifras+ "  de "+ numero1+ ". El nuevo número es "+ fin);
        return  fin_Int ;

    /**
     * Programa que lea dos variables enteras N y m y le quite a N sus m últimas
    cifras.
    Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234
    */

   
}
        public static int numeroDigitos(int numero2){
            var cifras=0;
            while(numero2!=0){
                numero2/=10;//divide en 10 para sacar el punto
                cifras++;
            }
            return cifras;
        }
        public static String eliminarPos (String numero,int cant){
            //var numeroInt= Integer.parseInt(numero);
            
            int indice= cant> numero.length()?0:numero.length()-cant;
            return numero.substring(0,indice);
        }
    
    /**
     * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
    teclado.
     */
    public static  double calcularVelocidad (){

        Scanner n= new Scanner (System.in);

        System.out.println("Ingrese la velocidad en Km/h a convertir");
        var vel= n.nextLine();
        var veldouble= Double.parseDouble(vel);
        var conversion= (1000/1)*veldouble;
        n.close();
        
        System.out.println(vel+" Kilómetro por segundo es = "+ conversion+" metro/segundo");
        return conversion;
        
        
    }

    /**
     * Programa que lea la longitud de los catetos de un triángulo rectángulo y
    calcule la longitud de la hipotenusa según el teorema de Pitágoras
     */
    public static double hallarHipotenusa (){

        Scanner l= new Scanner (System.in);
        
        System.out.println("Ingrese el valor del cateto N°1");
        var long1= l.nextDouble();
        var long1_conv = Double.valueOf(long1);

        
        System.out.println("Ingrese el valor del cateto N°2");
        var long2= l.nextDouble();
        var long2_conv = Double.valueOf(long2);
        l.close();
       
        var hipotenusa =Math.pow(long2_conv, 2)+ Math.pow(long1_conv, 2);
        
        return hipotenusa;
    }

    /**
     * Programa que lea un número entero y muestre si el número es
        múltiplo de 10
     */
    public static String verificarMultiplo10(){

        Scanner x = new Scanner (System.in);
        System.out.println("Ingrese el número entero ");
        var num= x.next();
        var num_str= Integer.parseInt(num);
        x.close();
        var res= (num_str%10==0)? "El número " +num+" es múltiplo de 10": "El número " +num+" No es múltiplo de 10";
        return res;
    }

    /**
     Programa que lea un carácter por teclado y compruebe si es
    una letra mayúscula
     */
    public static String comprobarMayuscula (){

       
        //System.out.println("Ingrese el caracter");
        //var char1= palabra.next();
        Scanner palabra= new Scanner(System.in);
        System.out.print("Introduzca un carácter: ");
        var car = palabra.next();
             
        char c = car.charAt(0);
        
        if (Character.isUpperCase(c)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else 
        {
            System.out.println("No es una letra mayúscula");
        }
        
        palabra.close();
        
        String charToString = String.valueOf(c);
        return charToString;
    }
    /**Programa que lea dos números por teclado y muestre el
        resultado de la división del primer número por el segundo. Se
        debe comprobar que el divisor no puede ser cero 
    */

    public static double dividirendos(){
        Scanner numero = new Scanner (System.in) ;
        System.out.println("Ingrese el primer número");
        var n1 = numero.nextDouble();

        System.out.println("Ingrese el segundo número");
        var n2 = numero.nextDouble();
        numero.close();

        if (n2==0)
        {
            System.out.println("Divisor no puede ser cero");
        }
        var division= n1/n2;
        double roundDbl = Math.round(division*100.0)/100.0;// cantidad de 0 antes del punto es la cantidad de decimales
        System.out.println("El resultado de dividir "+n1+ " en "+ n2 +" es "+ roundDbl);
        return division;
    }

    /**
     * 9.El programa lee por teclado tres números enteros y calcula y
        muestra el mayor de los tres.
     */

     public static int hallarmayor(){
        Scanner numero= new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        var num1 = numero.nextInt();

        System.out.println("Ingrese el segundo número");
        var num2 = numero.nextInt();

        System.out.println("Ingrese el tercer número");
        var num3 = numero.nextInt();
        numero.close();
        var maximo=0;
        if (num1>num2 && num1>num3){
            System.out.println(("El mayor de los tres números es "+num1));
            maximo= num1;
        }
        
        if (num2>num3 && num2>num1){
            System.out.println(("El mayor de los tres números es "+num2));
            maximo= num2;
        }
        else{
            System.out.println(("El mayor d4e los tres números es "+num3));
            maximo= num3;
        }
        

        return maximo;
    }

    /** 10. Programa que lea por teclado tres números enteros H, M, S
    correspondientes a hora, minutos y segundos respectivamente, y
    comprueba si la hora que indican es una hora válida
     * 
     */

    public static  int comprobarHora (){

        Scanner time= new Scanner(System.in);
        System.out.println("Ingrese la Hora: ");
        var hora= time.nextInt();
        var horaStr= String.valueOf(hora);

        System.out.println("Ingrese los minutos: ");
        var min= time.nextInt();
        var minStr= String.valueOf(min);

        System.out.println("Ingrese los segundos: ");
        var seg= time.nextInt();
        var segStr= String.valueOf(seg);

        var horaTotal = horaStr+minStr+segStr;
        var horat= Integer.parseInt(horaTotal);
        time.close();

        if (hora!=1){
        System.out.print("Son las: "+hora+ " horas");
        
        }else{
            System.out.print("Es la: "+hora );
        }

        if (min!=1){
            System.out.print(" con  "+min+ " minutos");
            } else{
                System.out.print(" con  "+min+ " minuto");
            }
        
        if (seg!=1){
                System.out.print(" y  "+seg+ " segundos");
       }
       else{
        System.out.print(" y  "+seg+ " segundo");
    }
            
        if ((hora >24 || hora <=0 )|| (min >60 || min <=0) ||( seg >60 || seg<=0)) {
            System.out.println("Hora fuera de los rangos válidos");
        }
        
       
        
        return horat;

    }

    /*Programa que lea una variable entera mes y compruebe si el
    valor corresponde a un mes de 30 días, de 31 o de 28.
    Supondremos que febrero tiene 28 días. Se mostrará además el
    nombre del mes. Se debe comprobar que el valor introducido esté
    comprendido entre 1 y 12
    */

    public static int asignarMeses(){

        Scanner m= new Scanner(System.in);
        System.out.println("Ingrese el mes entre un rango de 1 a 12");
        var mes = m.nextInt();
        m.close();
       

        if (mes<=0 || mes>12){
            System.out.println("El rango permitido está entre 1 a 12 no "+mes);
        } else{
        
        if (mes ==1){
                System.out.println("El mes es Enero");
            }   
        if (mes ==2){
            System.out.println("El mes es Febrero ");
        }
        if (mes ==3){
            System.out.println("El mes es Marzo ");
        }
        if (mes ==4){
            System.out.println("El mes es Abril ");
        }
        if (mes ==5){
            System.out.println("El mes es Mayo ");
        }
        if (mes ==6){
            System.out.println("El mes es Junio ");
        }
        if (mes ==7){
            System.out.println("El mes es Julio ");
        }
        if (mes ==8){
            System.out.println("El mes es Agosto ");
        }
        if (mes ==9){
            System.out.println("El mes es Septiembre ");
        }
        if (mes ==10){
            System.out.println("El mes es Octubre ");
        }
        if (mes ==11){
            System.out.println("El mes es Noviembre ");
        }
        if (mes ==12){
            System.out.println("El mes es Diciembre ");
        }
    }
    

        return mes;
    }
    /** Realizar programa que muestre los números del 1 al 100 que no
        sean múltiplos de 3, utilizando cada una las instrucciones
        repetitivas (while, do while, for)
    */
    public static int mostrarNomultiplosdetres (){
        
        int cont= 0;
        int num=0;
        /**while (cont<=100){
         
            if (!(num%3==0)){
                System.out.print(num);
                System.out.print("-");

            }
            
            cont++;
            num++;
            
            
        }
        
        return cont;
*/
     /**         
        do{
            if (!(num%3==0)){
                System.out.print(num);
                System.out.print("-");

            }
            
            cont++;
            num++;
        }while(cont<=100);
       
        return cont;
*/

        for (int i=1;i<=100;i++)
        {
            if (!(num%3==0)){
                

                cont++;
                //num++;
        }
        System.out.print(i);
        System.out.print("-");
    }
    return cont;
}


    public static float hallarNomultiplosde3(){
       float num=0;
        int cant=0;

        while(cant<=100){
            if (!(num%3==0)){
                
                System.out.println(num);
            }
            cant++;
            num++;
        }

        return cant;
    }
    /**
     * Programa que pase de pesos a dólares y viceversa
     */
    public static void convertirMoneda(){
    
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
                          //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
            var  opcion = sn.nextInt();
           sn.close();
       }

    }

    public void convertirDolar_Peso(){

        
        double valor1dolar= 3742.00;
        Scanner mon= new Scanner (System.in);
        System.out.println("Ingrese el valor a convertir");
        var valor= mon.nextFloat();
        mon.close();
        var valorConv= valor*valor1dolar;
        System.out.println( "El valor es de "+ valorConv);
    }

    public void convertirPeso_Dolar(){

        
        double valor1peso= 0.00027;
        Scanner mon= new Scanner (System.in);
        System.out.println("Ingrese el valor a convertir");
        var valor= mon.nextFloat();
        mon.close();
        var valorConv= valor* valor1peso;
        System.out.println( "El valor es de "+ valorConv);
    }
    /**
     * 
     *  Mostrar los N primeros términos de la serie de Fibonacci
     */

} 


    

    
