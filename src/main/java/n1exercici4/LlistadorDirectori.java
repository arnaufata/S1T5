package n1exercici4;

import java.io.*;

public class LlistadorDirectori {

    public static void lectorIPrintFitxer (String nomFitxer){

        try (BufferedReader lector = new BufferedReader(new FileReader(nomFitxer))){

            String linia;
            while ((linia = lector.readLine()) != null){
                System.out.println(linia);
            }
        } catch (IOException e){
            System.out.println("Error a la hora de llegir el fitxer: " + e.getMessage());
        }
    }
}


