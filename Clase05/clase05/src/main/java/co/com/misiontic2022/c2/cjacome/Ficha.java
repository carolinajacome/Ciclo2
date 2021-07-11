package co.com.misiontic2022.c2.cjacome;
//se agrega un modificar: Abstract class (no va a tener hijas)
public abstract class Ficha {

    private Color color;
    public Boolean comer(Casilla casilla){
        if(casilla.estaOcupada()&& casilla.esContrincante(color))
        {
            casilla.posicionarFicha(this);
            return true;
        }
        return false;
    }

    public  abstract Boolean mover(Casilla casilla);
        

    public Ficha(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    
    
}
