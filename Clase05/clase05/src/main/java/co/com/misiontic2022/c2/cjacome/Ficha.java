package co.com.misiontic2022.c2.cjacome;

public class Ficha {

    private String color;
    public Boolean comer(Casilla casilla){
        if(casilla.estaOcupada()&& casilla.esContrincante(color))
        {
            casilla.posicionarFicha(this);
            return true;
        }
        return false;
    }

    public Boolean mover(){
        return true;
    }

    public Ficha(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    
    
}
