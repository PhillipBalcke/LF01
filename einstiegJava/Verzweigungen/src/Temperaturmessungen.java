import java.io.IOException;

public class Temperaturmessungen {
    public static void main(String[] args) throws IOException {
        do {
            int tagesanzahl = eingaben();
            berechnungausgaben(tagesanzahl);
        } while (IO.readBoolean());
    }


    private static int eingaben() throws IOException {
        System.out.println("Bitte geben Sie die anzahl der Tag an");
        return IO.readInteger();
    }


    private static void berechnungausgaben(int anzahltage) throws IOException {
        double summetemperatur = 0;
        double maxtemperatur = 0;
        for (int i = 1; i <= anzahltage; i++) {
            System.out.println("Bitte geben Sie die Temperatur an Tag " + i + "\t" + "an");
            double tagestemperatur = IO.readDouble();
            if (i == 1) {
                maxtemperatur = tagestemperatur;
            } else {
                maxtemperatur = Math.max(maxtemperatur, tagestemperatur);
            }
            summetemperatur = summetemperatur + tagestemperatur;
        }
        double mittelwert = summetemperatur / anzahltage;
        System.out.println("Der Mittelwert beträgt " + mittelwert);
        System.out.println("Die maximale Temperatur beträgt " + maxtemperatur);

    }


}






