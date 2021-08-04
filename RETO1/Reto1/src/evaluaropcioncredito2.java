public class evaluaropcioncredito2 {
    
    //atributos

    private Double valor;
    private Integer tiempo;
    private double interes;
   
     //1)constructores
     EvaluarOpcionCredito(){
        this.valor=0.0;
        this.tiempo=0;
        this.interes=0.0;
    }
    evaluaropcioncredito2( Double pvalor,Integer ptiempo, Double pinteres){
        this.valor=pvalor;
        this.tiempo=ptiempo;
        this.interes=pinteres;

    }
    //metodos


    //métodos
    private Double calcularInteresCompuesto(Double valor,Integer tiempo,Double interes) {
        interes= 30.0;
        double interesCompuesto=valor*((Math.pow(1+(interes/100), tiempo))-1);
        System.out.println(interesCompuesto);
        return interesCompuesto;
    }
    private Double calcularInteresSimple(Double valor,Integer tiempo,Double interes) {
        interes= 26.0;
       double interesSimple=valor*((Math.pow(1+(interes/100), tiempo))-1);
    System.out.println(interesSimple);
        return interesSimple;

    }
    public String compararOpcion(Double pvalor, Integer ptiempo) {
        this.valor=pvalor;
        this.tiempo=ptiempo;
        this.calcularInteresCompuesto(valor, tiempo, interes);
        this.calcularInteresSimple(valor, tiempo, interes);
        
        
        if ((calcularInteresCompuesto(valor, tiempo, interes)> calcularInteresSimple(valor, tiempo, interes))||  (calcularInteresCompuesto(valor, tiempo, interes) == calcularInteresSimple(valor, tiempo, interes)))
       {
        return "credito especial";
       } 
       else{
       return "credito libre inversion";
       }
    }
    public String compararOpcion(){
        this.calcularInteresCompuesto(valor, tiempo, interes);
        this.calcularInteresSimple(valor, tiempo, interes);
               
        
        if ((calcularInteresCompuesto(valor, tiempo, interes)> calcularInteresSimple(valor, tiempo, interes))||  (calcularInteresCompuesto(valor, tiempo, interes) == calcularInteresSimple(valor, tiempo, interes)))
       {
        return "credito especial";
       } 
       else{
       return "credito libre inversion";
       }
    }
    }

    //definen comportamiento

    //Getters and setters


