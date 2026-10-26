import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Wurzel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Bitte den Startwert eingeben: ");
        String text = br.readLine();
        int startwert = Integer.parseInt(text.replace(',', '.'));

        System.out.println("Bitte den Endwert eingeben: ");
        text = br.readLine();
        int endwert = Integer.parseInt(text.replace(',', '.'));

        int eingabe;
        for (eingabe = startwert; eingabe <= endwert; eingabe++) {
        if (eingabe >= 0) {
            double wurzel = Math.sqrt(eingabe);
            System.out.println("Quadratwurzel von " + eingabe + " = " + wurzel);
        }


        }

    }
}