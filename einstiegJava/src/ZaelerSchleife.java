import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZaelerSchleife {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie Ihren Grenzwert ein:");
        String eingabeText = br.readLine().trim();
        int grenze = Integer.parseInt(eingabeText);

        int summe = 0;

        for ( int summand = 1; summand <= grenze; summand = summand +1) {
            summe = summe + summand;
        }
        System.out.println("Ihre summe betreagt: " + summe);

    }
}
