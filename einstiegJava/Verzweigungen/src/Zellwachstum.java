import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {
        do {
            forschleife();

            System.out.println("Wollen Sie eine weiter Rechnung durchführen dann geben Sie [j] ein");
        } while (IO.readBoolean());

    }

    private static void forschleife() throws IOException {
        System.out.print("Bitte die aktuelle Zellmenge eingeben: ");
        double zellmenge = IO.readDouble();
        System.out.print("Bitte den Wachstumsfaktor eingeben: ");
        int wachstumsfaktor = IO.readInteger();//(text.replace('.', ','));
        System.out.print("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
        int laufzeit = IO.readInteger();

        System.out.println("Tage:       Zellmenge: ");

        for (int i = 0; i <= laufzeit; ++i) {
            double ergebniss = Math.round(zellmenge * Math.pow(wachstumsfaktor,i) * 100) / 100.;

            System.out.print(i + "\t\t\t");
            System.out.println(ergebniss);




        }
    }



}
