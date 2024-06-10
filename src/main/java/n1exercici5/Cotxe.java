package n1exercici5;

import java.io.Serializable;

public class Cotxe implements Serializable {

    private String marca;
    private int numCavalls;

    public Cotxe(String marca, int numCavalls){
        this.marca      = marca;
        this.numCavalls = numCavalls;
    }

    @Override
    public String toString(){
        return "Característiques del cotxe:\n" +
                "    Marca: " + marca + "\n" +
                "    NumCavalls: " + numCavalls;
    }
}
