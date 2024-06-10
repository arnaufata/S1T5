package n1exercici5;

public class Main {
    public static void main(String[] args){
        if (args.length > 0){

            Cotxe cotxe = new Cotxe("Nissan", 95);
            String fitxerSer = "cotxe.ser";

            LlistadorDirectori.serialitzarObjecte(cotxe, fitxerSer);

            Cotxe cotxeDesserialitzat = (Cotxe) LlistadorDirectori.desserialitzarObjecte(fitxerSer);
            System.out.println("Objecte desserialitzat amb èxit: " + cotxeDesserialitzat);
        } else {
            System.out.println("Siusplau, proporcioneu el camí al fitxer");
        }
    }
}
