package n1exercici4;

public class Main {
    public static void main(String[] args){
        if (args.length > 0){
            String rutaFitxer = args[0];
                LlistadorDirectori.lectorIPrintFitxer(rutaFitxer);
        } else {
            System.out.println("Siusplau, proporcioneu el camí al fitxer");
        }

    }
}
