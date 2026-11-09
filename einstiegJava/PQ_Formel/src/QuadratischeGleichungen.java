import java.io.IOException;

public class QuadratischeGleichungen {

    /**
     * Berechnet die beiden Lösungen der quardartischen Gleichung.
     * 
     * @param args Keine Argumente
     * @throws IOException Fehler beim Lesen der Eingabewerte.
     */
     public static void main(String[] args) throws IOException {

        System.out.println("Geben sie p ein: ");
        double p = IO.readDouble();

        System.out.println("Geben sie q ein: ");
        double q = IO.readDouble();


        double x1 = ((p / 2) *-1) + Math.sqrt( Math.pow((p/2), 2) -q );

        double x2 = ((p / 2) *-1) - Math.sqrt( Math.pow((p/2), 2) -q );


        System.out.println("Lösung X1 = " + x1);
        System.out.println("Lösung X2 = " + x2);

    } // main()

} // class QuadratischeGleichungen
