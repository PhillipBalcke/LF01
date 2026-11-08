import java.io.IOException;

public class KreiszahlPI {
    
    /**
     * Berechnet die Annäherung der Kreiszahl PI.
     * 
     * @param args Keine Argumente
     * @throws IOException Fehler beim Lesen der Eingabewerte.
     */
     public static void main(String[] args) throws IOException {

        System.out.println("Geben Sie bitte die Anzahl der Durchläufe (n) ein ein: ");
        final int anzahlDurchlaeufe = IO.readInteger();

        double summe = 0;
        for (int n = 0; n <= anzahlDurchlaeufe; n++) {

            double term = Math.pow(-1, n) / (2 * n + 1);

            summe += term;

        } // for n

        double pi = 4 * summe;

        System.out.println("Näherung von PI = " + pi);

        double abweichungPI = Math.abs(pi - Math.PI);

        System.out.println("Abweichung von PI = " + abweichungPI);

    } // main()
    
} // class KreiszahlPI
