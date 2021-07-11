package co.com.misiontic2022.c2.cjacome;

public class Tablero {

    //representar que un tablero está representado 
    //por 64 casillas.

    private Casilla[]  casillas; 
    //crear constructor:
    //no retorna nada MISMO NOMBRE DE LA CLASE

    public Tablero(){

        casillas= new Casilla [64];
        //reservo la cantidad de espacio

        for (int i = 0; i < 64; i++) {
            casillas[i]= new Casilla(i/8,i%8);
        }

    }
    public Boolean puedeHacerenroque(){
        return true;
    }
    
    public Boolean estaEnjaque (){
        return true;
    }

    public Boolean estajaqueMate(){
        return true;
    }
}
