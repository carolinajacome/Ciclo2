public class EvaluarOpcionCredito3{
  public Double valor;
  public Integer tiempo;
  public Double interes;


  public EvaluarOpcionCredito3(){
      this.tiempo=0;
      this.valor=0.0;
      this.interes=0.0;
  }
  public EvaluarOpcionCredito3(int pTiempo,double pCapital, double pInteres)
  {
      this.tiempo=pTiempo;
      this.valor=pCapital;
      this.interes=pInteres;
  }
  public double calcularInteresSimple()
  {   
    this.interes= 30.0;
      double interes=this.valor*(this.interes/100)*this.tiempo;
      return interes;
  }
  public double calcularInteresCompuesto()
  {
    this.interes= 30.0;
      return this.valor*(Math.pow(1+(this.interes/100), this.tiempo)-1);
  }
  public double compararInversion()
  {
      return (calcularInteresCompuesto()-calcularInteresSimple());
  }
  public double compararInversion(int ptiempo, double pcapital,double pinteres)
  {
      this.tiempo=ptiempo;
      this.valor=pcapital;
      this.interes=pinteres;
      double diferencia=this.calcularInteresCompuesto()-this.calcularInteresSimple();
      return (diferencia);
  }

  public String compararOpcion(Double valor, Integer tiempo) {
    
   
    if ((this.interesCompuesto>this.interesSimple)|| (this.interesCompuesto==this.interesSimple)) {
        return "credito especial";
       } 
       else{
       return "credito libre inversion";
       }
}
public String compararOpcion(){
    
    this.calcularInteresCompuesto(valor, tiempo, interes);
    this.calcularInteresSimple(valor, tiempo, interes);
    
   
    if ((this.interesCompuesto>this.interesSimple)|| (this.interesCompuesto==this.interesSimple)) {
        return "credito especial";
       } 
       else{
       return "credito libre inversion";
       }
}
}


}