import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Maxima {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Geben Sie bitte -100 ein, wenn Sie mit der Erfassung der Werte fertig sind.");
            System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
            System.out.print("Wie viele Werte? ");
            double werte = IO.readDouble();

            final List<Double> listOfWerten = new ArrayList<>();

            /* Eingaben des Anwenders. */
            double wert = 0;
            while (true) {
                wert++;
                System.out.printf("%nBitte geben Sie den Wert" + "\t" + wert + " ein: ");
                double eingabe = IO.readDouble();
                if (eingabe <= -100) {
                    break;
                }
                listOfWerten.add(eingabe);

            } // while

            if (listOfWerten.isEmpty()) {
                System.out.println("ABBRUCH - Sie haben keine Werte erfasst.");
                return;
            } // if
            else {

                Double maxWert = -1000.00;
                for (final Double temperatur : listOfWerten) {

                    if (temperatur > maxWert) {
                        maxWert = temperatur;
                    }

                }
                Double maxwert = null;
                Double zweitGroesster = null;

                for (double zahl : listOfWerten) {
                    if (maxwert == null || zahl > maxwert) {
                        zweitGroesster = maxwert;
                        maxwert = zahl;
                    } else if (zahl != maxwert && (zweitGroesster == null || zahl > zweitGroesster)) {
                        zweitGroesster = zahl;
                    }

                }
                    if (zweitGroesster != null) {
                        System.out.println("Zweitgrößter Wert: " + zweitGroesster);
                    } else {
                        System.out.println("Kein zweitgrößter Wert vorhanden.");

                    }


                    System.out.printf("Größter Wert: %.2f Grad.%n", maxwert);
                    System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");


            }


        } while (IO.readBoolean()) ;

    }
}



