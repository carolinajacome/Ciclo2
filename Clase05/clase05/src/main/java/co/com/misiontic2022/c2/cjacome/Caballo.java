package co.com.misiontic2022.c2.cjacome;

public class Caballo  extends Ficha{


    
    public Caballo(Color color) {
        super(color);
        
    }

    public Boolean mover(){
        return true;
    }
    //override->sobreescribir/polimorfismo
    //cambiar la forma de implementar el método.
    @Override
    public Boolean mover(Casilla casilla) {
        return null;
    }
    
}
