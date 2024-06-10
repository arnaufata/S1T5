package n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LlistadorDirectori {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void directoriList(String directoriPath) throws FileNotFoundException {

        File directori = new File(directoriPath);

        if (!directori.isDirectory()){
            throw new FileNotFoundException("Ruta del directori no trobada");
        }

        llistarDirectoriRecursivament(directori, 0);
    }

    public static void llistarDirectoriRecursivament (File directori,int level){
        File[] arxius = directori.listFiles();

        String nivellBase = "    ".repeat(level);

        if (directori.isFile()){
            System.out.println(nivellBase + "F: " + directori.getName() + " Última modificació: "
            + sdf.format(directori.lastModified()));
        } else if (directori.isDirectory()){
            System.out.println(nivellBase + "D: " + directori.getName() + " Última modificació: "
            + sdf.format(directori.lastModified()));
            if(arxius != null){
                Arrays.sort(arxius);
                for (File arxiu : arxius){
                    llistarDirectoriRecursivament(arxiu, level + 1);
                }
            }
        }
    }
}


