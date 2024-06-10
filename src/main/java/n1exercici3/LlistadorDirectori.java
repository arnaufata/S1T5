package n1exercici3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LlistadorDirectori {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void directoriList(String directoriPath) throws FileNotFoundException {

        File directori = new File(directoriPath);

        if (!directori.isDirectory()){
            throw new FileNotFoundException("Ruta del directori no trobada");
        }


        List<String> llistaContingut = new ArrayList<>();
        llistarDirectoriRecursivament(directori, 0, llistaContingut);

        try(FileWriter directoriList = new FileWriter("n1exercici3/LlistatContingutDirectori.txt", true)){
            for (String line : llistaContingut) {
                directoriList.write(line + "\n");
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void llistarDirectoriRecursivament (File directori,int level, List<String> llistaContingut){
        File[] arxius = directori.listFiles();

        String nivellBase = "    ".repeat(level);

            if (directori.isFile()){
                llistaContingut.add(nivellBase + "F: " + directori.getName() + " Última modificació: "
                        + sdf.format(directori.lastModified()) + "\n");
            } else if (directori.isDirectory()){
                llistaContingut.add(nivellBase + "D: " + directori.getName() + " Última modificació: "
                        + sdf.format(directori.lastModified()) + "\n");
                if(arxius != null){
                    Arrays.sort(arxius);
                    for (File arxiu : arxius){
                        llistarDirectoriRecursivament(arxiu, level + 1, llistaContingut);
                    }
                }
            }
    }
}


