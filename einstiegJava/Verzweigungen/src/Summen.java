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

            while (true) {
                wert++;
                System.out.printf("%nBitte geben Sie den Wert" + "\t" + wert + " ein: ");
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
            else {
                int anzahlGerade = 0;
                int anzahlUngerade = 0;
                int summeGerade = 0;
                int summeUngerade = 0;

                for (int zahl : listOfGanzZahlen) {
                    if (zahl % 2 == 0) {
                        anzahlGerade++;
                        summeGerade += zahl;
                    } else {
                        anzahlUngerade++;
                        summeUngerade += zahl;
                    }
                }


                System.out.println("Anzahl gerader Zahlen: " + anzahlGerade);
                System.out.println("Summe gerader Zahlen: " + summeGerade);
                System.out.println("Anzahl ungerader Zahlen: " + anzahlUngerade);
                System.out.println("Summe ungerader Zahlen: " + summeUngerade);

                System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");
            }
        } while (IO.readBoolean());
    }
}