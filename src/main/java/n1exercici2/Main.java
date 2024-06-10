package n1exercici2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        if (args.length > 0){
            String rutaDirectori = args[0];
            try{
                LlistadorDirectori.directoriList(rutaDirectori);
            } catch (FileNotFoundException e){
                System.out.print(e.getMessage());
            }
        } else {
            System.out.println("Siusplau, proporcioneu el camí del directori");
        }

    }
}
