package n1exercici5;

import java.io.*;

public class LlistadorDirectori {

    public static void serialitzarObjecte(Cotxe cotxe, String fitxer) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fitxer))){
            objectOutputStream.writeObject(cotxe);
            System.out.println("Objecte serialitzat a " + fitxer);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cotxe desserialitzarObjecte(String fitxer){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fitxer))){
            Cotxe cotxe = (Cotxe) objectInputStream.readObject();
            return cotxe;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}


