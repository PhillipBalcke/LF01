import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperaturMessungMitListe {

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Geben Sie bitte -100 ein, wenn Sie mit der Erfassung der Temperaturen fertig sind.");

            /* Die Liste enthält die vom Anwender eingebenen Temperaturen je Tag. */
            final List<Double> listOfTemperaturen = new ArrayList<>();

            /* Eingaben des Anwenders. */
            int tag = 0;
            while (true) {

                tag++;
                System.out.printf("%nBitte geben Sie die Temperatur an Tag %d ein: ", tag);

                double temperatur = IO.readDouble();

                if (temperatur <= -100) {
                    break;
                }

                listOfTemperaturen.add(temperatur);

            } // while


            if (listOfTemperaturen.isEmpty()) {
                System.out.println("ABBRUCH - Sie haben keine Werte erfasst.");
                return;
            } // if


            /* Berechne Mittelwert und die maximale Temperatur. */
            Double maxTemperatur = -1000.00; // diese Temperatur kann nicht existieren.
            Double summeDerTemperaturen = 0.00;
            for (final Double temperatur : listOfTemperaturen) {

                summeDerTemperaturen += temperatur;

                if (temperatur > maxTemperatur) {
                    maxTemperatur = temperatur;
                }

            } // for temperatur


            final Double mittelwertTemperatur = summeDerTemperaturen / listOfTemperaturen.size();

            double minTemperatur = 1000.00;//Mindest Temperatur
            for (final double temperatur : listOfTemperaturen) {

                if (temperatur < minTemperatur) {
                    minTemperatur = temperatur;
                }

            }

            double spannweite = maxTemperatur - minTemperatur;//Spanweite


            double maxDifferenz = 0.0;

            for (int i = 1; i < listOfTemperaturen.size(); i++) {
                double vorherigeTemperatur = listOfTemperaturen.get(i - 1);
                double aktuelleTemperatur = listOfTemperaturen.get(i);
                double sprung = Math.abs(aktuelleTemperatur - vorherigeTemperatur);

                if (sprung > maxDifferenz) {
                    maxDifferenz = sprung;
                }
            }



            /* Ausgabe der berechneten Werte. */
            System.out.printf("Der Mittelwert der Temperaturen beträgt: %.2f Grad.%n", mittelwertTemperatur);
            System.out.printf("Die Maximale Temperatur betrug: %.2f Grad.%n", maxTemperatur);
            System.out.printf("Die Minimale Temperatur betrug: %.2f Grad.%n", minTemperatur);
            System.out.printf("Die Spannweite beträgt: %.2f %n", spannweite);
            System.out.printf("Die Maximale Differenz beträgt: %.2f %n",maxDifferenz);

            System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");
        }while (IO.readBoolean());



    } // main/()


} // class TemperaturMessungMitListe