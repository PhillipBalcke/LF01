import java.io.IOException;

public class SuchenINArray {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------------------------------");
        System.out.println("Bitte geben Sie ein Array bestehend aus 5 Kommazahlen ein.");

        System.out.print("Wert 1 eingeben: ");
        double wert1 = IO.readDouble();
        System.out.print("Wert 2 eingeben: ");
        double wert2 = IO.readDouble();
        System.out.print("Wert 3 eingeben: ");
        double wert3 = IO.readDouble();
        System.out.print("Wert 4 eingeben: ");
        double wert4 = IO.readDouble();
        System.out.print("Wert 5 eingeben: ");
        double wert5 = IO.readDouble();


        System.out.println("Nach welcher Zahl wollen Sie suchen ? ");
        double suchZahl = IO.readDouble();

        double [] werte = new double[6];

        for(int i = 0; i < werte.length; i++) {
            werte[i] = IO.readDouble();
            if (suchZahl == werte[i]) {
                System.out.println("Treffer");
            }
            else {
                System.out.println("Niete");
            }
        }



    }
}
