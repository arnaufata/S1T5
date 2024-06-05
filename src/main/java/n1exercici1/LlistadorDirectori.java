package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class LlistadorDirectori {
    public static void directoriList(String filePath) throws FileNotFoundException {

        File directori = new File(filePath);

        if (!directori.isDirectory()){
            throw new FileNotFoundException("Ruta del directori no trobada");
        }

        String[] arxius = directori.list();
        if (arxius != null){
            Arrays.sort(arxius);
            for (String arxiu : arxius){
                System.out.println(arxiu);
            }
        } else {
            System.out.print("Aquest directori està buit");
        }
    }
}
