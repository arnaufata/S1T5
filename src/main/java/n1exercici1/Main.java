package n1exercici1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){

        String rutaDirectori = args[0];
        try{
            LlistadorDirectori.directoriList(rutaDirectori);
        } catch (FileNotFoundException e){
            System.out.print(e.getMessage());
        }
    }
}
