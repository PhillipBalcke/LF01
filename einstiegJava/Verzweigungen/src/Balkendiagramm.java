import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Balkendiagramm {
    public static void main(String[] args) throws IOException {

        do {
            System.out.println("----------------------------------");
            System.out.print("Wie viele Kandidaten sind noch im Rennen? ");
            int wert = IO.readInteger();
            double[] werte = new double[wert];
            System.out.println("Erfassen Sie jetzt die prozentuale Verteilung des Votings: ");


            for (int i = 0; i < werte.length; i++) {
                System.out.println("Kandidat " + (i + 1) + ":");
                werte[i] = IO.readDouble();
            }

            System.out.println("Ergebnis");
            for (int i = 0; i < werte.length; i++) {
                System.out.print("Kandidat " + (i + 1) + ":");
                for (int j = 0; j < werte[i]; j++) {
                    System.out.print("*");
                }
                System.out.println(" " + werte[i] + "%");
            }

            System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben sie [j] ein");
        } while (IO.readBoolean());
    }
}