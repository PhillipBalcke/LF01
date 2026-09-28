import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

import static java.awt.SystemColor.text;

public class Bestellung {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double preisSchrauben = 0.05;
        double preisMuttern = 0.03;
        double preisUnterlegscheiben = 0.01;


        System.out.println("Geben Sie Ihre Anzahl an Schrauben an");
        String text = br.readLine();
        int anzahlSchrauben = Integer.parseInt(text.replace(',', '.'));

        System.out.println("Geben Sie Ihre Anzahl an Muttern an");
        text = br.readLine();
        int anzahlMuttern = Integer.parseInt(text.replace(',', '.'));

        System.out.println("Geben Sie Ihre Anzahl an Unterlegscheiben an");
        text = br.readLine();
        int anzahlUnterlegscheiben = Integer.parseInt(text.replace(',', '.'));


        if (anzahlSchrauben == anzahlMuttern) {
            System.out.println("Die Bestellung stimmt über ein");
        }else {
            System.out.println("Die Bestellung muss noch einmal überprüft werden");
        }

    }


}
