import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Summen {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("----------------------------------");
            System.out.println("Geben Sie bitte -100 ein, wenn Sie mit der Erfassung der Werte fertig sind.");
            System.out.println("Bitte geben Sie ein Array aus Ganzzahlen ein: ");
            System.out.print("Wie viele Werte? ");
            int zahlen = IO.readInteger();

            final List<Integer> listOfGanzZahlen = new ArrayList<>();
            int wert = 0;
            int anzahl = 0;
            int summe = 0;

            while (true) {
                wert++;
                System.out.printf("%nBitte geben Sie den Wert" + "\t" + wert + " ein; ");
                int eingabe = IO.readInteger();
                if (eingabe <= -100) {
                    break;
                }
                listOfGanzZahlen.add(eingabe);
            } // while

            if (listOfGanzZahlen.isEmpty()) {
                System.out.println("Abbruch - Sie haben keine Werte erfasst.");
                return;
            } //if


            System.out.println("Gerade Zahlen:");
            System.out.println("Anzahl ");
            System.out.println("Summe ");

            System.out.println("Ungerade Zahlen");
            System.out.println("Anzahl ");
            System.out.println("Summe ");

            System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");
        }while (IO.readBoolean());

    }
}
