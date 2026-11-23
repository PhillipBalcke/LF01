import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperaturMessungMitListe {

    public static void main(String[] args) throws IOException {

        System.out.println("##################################################################################");
        System.out.println("Geben Sie bitte -100 ein, wenn Sie mit der Erfassung der Temperaturen fertig sind.");

        /* Die Liste enthält die vom Anwender eingebenen Temperaturen je Tag. */
        final List<Double> listOfTemperaturen = new ArrayList<>();

        /* Eingaben des Anwenders. */
        int tag = 0;
        while(true){

            tag++;
            System.out.printf("%nBitte geben Sie die Temperatur an Tag %d ein:", tag);

            Double temperatur = IO.readDouble();

            if(temperatur <= -100)  { break; }

            listOfTemperaturen.add(temperatur);

        } // while 


        if(listOfTemperaturen.isEmpty()){
            System.out.println("ABBRUCH - Sie haben keine Werte erfasst.");
            return;
        } // if


        /* Berechne Mittelwert und die maximale Temperatur. */
        Double maxTemperatur = -1000.00; // diese Temperatur kann nicht existieren.
        Double summeDerTemperaturen = 0.00;
        for(final Double temperatur : listOfTemperaturen){

            summeDerTemperaturen += temperatur;

            if(temperatur > maxTemperatur) { maxTemperatur = temperatur; }

        } // for temperatur


        final Double mittelwertTemperatur = summeDerTemperaturen / listOfTemperaturen.size();

        /* Ausgabe der berechneten Werte. */
        System.out.printf("Der Mittelwert der Temperatur beträgt: %.2f Grad.%n", mittelwertTemperatur);
        System.out.printf("Die maximale Temperatur betrug: %.2f Grad.%n", maxTemperatur);

    } // main/()


} // class TemperaturMessungMitListe