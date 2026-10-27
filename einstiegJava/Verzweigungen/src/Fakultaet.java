import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fakultaet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String text = br.readLine();

        System.out.println("Bis zu welcher ganzen Zahl soll die Fakultät berechnet werden?");
        String text = br.readLine();
        double zahl = Double.parseDouble(text.replace(',', '.'));
        if (zahl < 0) {
            System.out.println("");
        } else {
            long Fakultaet = 1;
            for (int i = 1; i <= zahl; i++) ;
            {
                double Fakulteat = 1;
                long i = Fakultaet;
                Fakultaet = Fakultaet * i;

                System.out.println("Die Fakultät von " + i+  "=" + Fakultaet);

            }
        }

    }

}
