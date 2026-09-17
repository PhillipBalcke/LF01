import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZaelerSchleife {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie Ihren Grenzwert ein");
        String eingabeText = br.readLine();
        int grenze = Integer.parseInt(eingabeText);

        int summe;

        for ( summe = 0; int summand = 1; (summand <= grenze  summe = summe + summand; summand = summand +1;

        System.out.println(summe);

    }
}
