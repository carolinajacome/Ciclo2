public class Proyecto {
    private int tiempo;
    private double capital;
    private double interes;

    public Proyecto() {
        this.tiempo = 0;
        this.capital = 0.0;
        this.interes = 0.0;
    }

    public Proyecto(int ptiempo, double pcapital, double pinteres) {
        this.tiempo = ptiempo;
        this.capital = pcapital;
        this.interes = pinteres;
    }
      
    public double calcularInteresSimple(){


       double interesSimple= this.capital*(30/100)*this.tiempo;
       return interesSimple;
    }

    public double calcularInteresCompuesto(){
        double interesCompuesto = this.capital* (Math.pow(1+(this.interes/100), this.tiempo)-1);
        return interesCompuesto;
    }

    public double cotejarInversion (int ptiempo, double pcapital, double pinteres){

        this.tiempo = ptiempo;
        this.capital = pcapital;
        this.interes = pinteres;
        double diferencia=0;

        diferencia= calcularInteresCompuesto()- calcularInteresSimple();
        return diferencia;
    }
}
