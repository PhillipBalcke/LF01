import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.awt.SystemColor.text;

public class TaschenRechner {

    public static void main(String[] args) throws IOException {


        System.out.println("Bitte die Rechenoperation wählen: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        System.out.println(" Geben sie Ihre erste Zahl ein: ");
        text = br.readLine();
        double zahl1 = Double.parseDouble(text.replace(',', '.'));

        System.out.println(" Geben sie Ihre zweite Zahl ein: ");
        text = br.readLine();
        double zahl2 = Double.parseDouble(text.replace(',', '.'));





        double summe = zahl1 + zahl2;
        double produkt = zahl1 * zahl2;
        double differenz = zahl1 - zahl2;
        double quotient = zahl1 / zahl2;

        System.out.println(" Zahl X: " + zahl1);
        System.out.println(" Zahl Y: " + zahl2);
        System.out.println("Die Summe beträgt " + summe);
        System.out.println(" Das Produkt beträgt " + produkt);
        System.out.println(" Doe differenz beträgt " + differenz);
        System.out.println("Der Quotient beträt " + quotient);




    }





}

