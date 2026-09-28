import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuehrerschein {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind sie?");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int alter = Integer.parseInt(text.replace(',', '.'));



        if (alter < 14) {
            System.out.println("Du darfst Bobby-Car oder Fahrrad fahren");
        }
        else if (alter <= 16) {
            System.out.println("Du darfst schon 50er fahre");
        }
        else if (alter < 18) {
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto");
        }
        else if (alter >= 18) {
            System.out.println("Du darfst jetzt auch Auto fahren");
        }


        }

}

