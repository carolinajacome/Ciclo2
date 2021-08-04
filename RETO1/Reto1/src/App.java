public class App {
  public static void main(String[] args) throws Exception {
    evaluaropcioncredito2 evaluar = new evaluaropcioncredito2();
        String eleccion = evaluar.compararOpcion(1000000.0, 1);
       String eleccion2= evaluar.compararOpcion(3000000.0,12);
        System.out.println(eleccion);
        System.out.println(eleccion2);


        BecaUniversitaria evaluar1 = new BecaUniversitaria();
    String eleccion1 = evaluar1.compararInversion(12,3000000.0);

    String eleccion4 = evaluar1.compararInversion(1,1000000.0);
    //String eleccion2 = evaluar1.compararInversion(12,3000000.0, 26.0);
       // String eleccion11= evaluar1.compararOpcion(1000000.0,2);
        System.out.println("este es el 1:"+eleccion1);
        System.out.println("este es el 2:"+eleccion4);
        //System.out.println(eleccion11);

    }
}


/*public static void main( String[] args )
{
    CalcularInversion evaluar = new CalcularInversion();
    double eleccion = evaluar.compararInversion(12,3000000.0, 26.0);
    double eleccion2 = evaluar.compararInversion(12,3000000.0, 30.0);
    System.out.println(eleccion);
    System.out.println(eleccion2);
    
}
}
*/