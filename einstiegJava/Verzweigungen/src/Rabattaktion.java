import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rabattaktion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        double versandkosten = 4.99;
        int Pizza = 20;
        int Döner = 15;

        System.out.println("Geben sie Ihre Anzahl an Pizzen an");
        String text = br.readLine();
        int anzahlPizza = Integer.parseInt(text.replace(',' , '.'));

        System.out.println("Geben sie Ihre Anzahl an Döner an");
        text = br.readLine();
        int anzahlDöner = Integer.parseInt(text.replace(',' , '.'));


        double Gesamtbetrag = (anzahlPizza * Pizza) + (anzahlDöner * Döner) + versandkosten;
        System.out.println("Der Gesamtbetrag ist: " + Gesamtbetrag + "€");

        if (Gesamtbetrag >= 50) {
            System.out.println("Ihre Bestellung wird versandkostenfrei geliefert!");
        }
        else {
            System.out.println("Hinweis: Ab 50 € ist der Versand kostenlos!");
        }








    }
}
