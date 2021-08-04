public class BecaUniversitaria {
    
    private int tiempo;
    private double monto;
    private double interes;
    
    public BecaUniversitaria() 
    {
    tiempo=0;
    monto=0;
    interes=0;
        
    }

    public BecaUniversitaria(int ptiempo, double pmonto, double pinteres) {
        this.tiempo = ptiempo;
        this.monto = pmonto;
        this.interes = pinteres;
    }

public double calcularInteresSimple(){


        double interesSimple= monto*(30/100)*tiempo;
        return interesSimple;
     }
 
     public double calcularInteresCompuesto(){
         double interesCompuesto = monto* (Math.pow(1+(26/100), tiempo)-1);
         return interesCompuesto;
     }

public String compararInversion ( int ptiempo, double pmonto)
{
    this.tiempo = ptiempo;
        this.monto = pmonto;
        double mayor=0;
        if ((calcularInteresCompuesto()> calcularInteresSimple())||  (calcularInteresCompuesto() == calcularInteresSimple()))
        
        {
            return "La diferencia entre el interes simples es "+  mayor;
            

        }
        else{
            return "No se obtuvo diferencia 2";
        }


       /* double diferencia= calcularInteresCompuesto()-calcularInteresSimple();
        if (diferencia!=0){
            return "La diferencia entre el interes simples es "+ diferencia;

        }
        else{
            return "No se obtuvo diferencia";
        }
        */
}



public String compararInversion(){
    double mayor=0;
     
        if ((calcularInteresCompuesto()> calcularInteresSimple())||  (calcularInteresCompuesto() == calcularInteresSimple()))
        
        {
            return "La diferencia entre el interes simples es "+  mayor;
            

        }
        else{
            return "No se obtuvo diferencia 2";
        }
}
    }
