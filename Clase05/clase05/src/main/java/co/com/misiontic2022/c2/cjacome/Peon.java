package co.com.misiontic2022.c2.cjacome;

public class Peon extends Ficha {
    
    public Peon(Color color) {
        super(color);
    }


    public Boolean comer(){
        return true;
    }


    public Boolean coronar(){
        return true;
    }
    public Boolean mover(){
        return true;
    }


    @Override
    public Boolean mover(Casilla casilla) {
        return null;
    }
}