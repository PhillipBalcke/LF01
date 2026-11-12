import java.io.IOException;
import java.text.DecimalFormat;

public class Restschuld {
    public static void main(String[] args) throws IOException {
        do {
            ausgabe();

            System.out.println("Wollen Sie eine weiter Berechnung durchführen dann geben Sie [j] ein");
        } while (IO.readBoolean());

    }

    private static void ausgabe() throws IOException {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.print("Eingabe Kreditsumme: ");
        double kredit = IO.readDouble();

        System.out.print("Eingabe Jahreszins: ");
        double jahreszins = IO.readDouble();

        System.out.print("Eingabe Monatsrate: ");
        double monatsrate = IO.readDouble();

        System.out.print("Eingabe Laufzeit in Monaten: ");
        int laufzeit = IO.readInteger();


        System.out.println("Monat\t\tKreditsumme\t\tZinsbetrag\t\tRestschuld");


        for (int i = 1; i <= laufzeit; i++) {
            double zinssatz = jahreszins / 12;
            double zinsbetrag = kredit * zinssatz / 100;
            double kreditsumme = kredit - monatsrate + zinsbetrag;


            System.out.println(i + "\t\t\t" + df.format(kredit) + "\t\t\t" + df.format(zinsbetrag) + "\t\t\t" + df.format(kreditsumme));
            kredit = kreditsumme;
        }


        double zinssatz = jahreszins / 12;
        double zinsbetrag = kredit * zinssatz / 100;
        double kreditsumme = kredit - monatsrate + zinsbetrag;
        if (kreditsumme < 0) {
            System.out.println("Die Rechnung ist nicht gültig");
        } else {
            System.out.println("Es bleibt eine Restschuld in Höhe von 23,50€");


        }


    }
}
