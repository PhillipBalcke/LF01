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

                Double maxTemperatur = -1000.00;
                for (final Double temperatur : listOfWerten) {

                    if (temperatur > maxTemperatur) {
                        maxTemperatur = temperatur;
                    }

                }
                Double maxwert = null;
                for (double zahl : zahlen) {
                    if (maxwert == null || zahl > maxwert) {
                        maxwert = maxwert;
                        maxwert = zahl;
                    } else if (zahl != maxwert && (maxwert == null || zahl > maxwert)) {
                        maxwert = zahl;
                    }
                }

                if (maxwert != null) {
                    System.out.println("Zweitgrößter Wert: " + maxwert);
                } else {
                    System.out.println("Kein eindeutiger zweitgrößter Wert vorhanden.");
                }






                System.out.printf("Die Maximale Temperatur betrug: %.2f Grad.%n", maxwert);
                System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");
            }

        }while (IO.readBoolean()) ;

    }

}



