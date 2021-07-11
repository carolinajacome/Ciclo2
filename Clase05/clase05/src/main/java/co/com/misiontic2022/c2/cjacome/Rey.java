package co.com.misiontic2022.c2.cjacome;


//la herencia se representa con extends.
//REY va a heredar de la clase FICHA
public class Rey  extends Ficha{


    
    public Rey(String color) {
        super(color);
       
    }

    public Boolean mover(){
        
        this.getColor();
        return true;
    }

    @Override
    public Boolean mover(Casilla casilla) {
        return null;
    }
}
