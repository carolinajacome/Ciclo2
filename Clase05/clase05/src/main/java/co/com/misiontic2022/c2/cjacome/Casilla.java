package co.com.misiontic2022.c2.cjacome;

public  class Casilla {
    



    private String color;
    private Integer columna;
    private Integer fila;

    //crear constructor:
    //clic derecho: source action: create constructor
    private Ficha ficha;

    public Casilla(Integer fila, Integer columna) {
        this.columna = columna;
        this.fila = fila;
        this.color= calcularColor();
    }

    private String calcularColor(){
        if ((fila %2==0 && columna%2==0) || (fila%2!=0 && columna%2!=0)){
            return "Blanco";

        }
        return "Negro";
    }
    public Boolean estaOcupada(){
        return ficha!=null;
    }
    //se le agrega la negación para que el return sea verdadero
    public Boolean esContrincante(String color){
        return ficha!=null && ficha.getColor().equals(color);
    }



    public void posicionarFicha(Ficha ficha){
        this.ficha= ficha;
    }

    public Boolean estaOcupado(){
        return true;
    }
//transformación Objeto a Cadena
    public String toString(){
        return "Casilla [color= "+ color + " , columna"+ columna+ " , fila"+ fila +"]";
    }

   
}
