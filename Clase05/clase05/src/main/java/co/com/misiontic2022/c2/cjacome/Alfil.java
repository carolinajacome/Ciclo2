package co.com.misiontic2022.c2.cjacome;

public class Alfil  extends Ficha {
    public Alfil(String color) {
        super(color);
        
    }

    public Boolean mover(){
        return true;
    }

    @Override
    public Boolean mover(Casilla casilla) {
        return null;
    }
}
