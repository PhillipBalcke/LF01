import java.io.IOException;

public class PQ_FormelXL {

    /**
     * Berechnet die beiden Lösungen der quardartischen Gleichung.
     *
     * @param args Keine Argumente
     * @throws IOException Fehler beim Lesen der Eingabewerte.
     */
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Geben sie p ein: ");
            double p = IO.readDouble();

            System.out.print("Geben sie q ein: ");
            double q = IO.readDouble();

            double d = Math.pow(-p/2,2) -q;
            if (d < 0) {
                System.out.println("Es gibt keine Lösung");
            } else if (d == 0) {
                double x1 = ((p / 2));
                System.out.println("DIe Lösung ist: " + x1);
            } else  {
                double x1 = ((p / 2) * -1) + Math.sqrt(Math.pow((p / 2), 2) - q);

                double x2 = ((p / 2) * -1) - Math.sqrt(Math.pow((p / 2), 2) - q);


                System.out.println("Lösung X1 = " + x1);
                System.out.println("Lösung X2 = " + x2);
            }




            System.out.println("Wollen Sie eine weitere Rechnung durchführen dann geben sie [j] ein");
        }while (IO.readBoolean());



    } // main()

} // class QuadratischeGleichungen


