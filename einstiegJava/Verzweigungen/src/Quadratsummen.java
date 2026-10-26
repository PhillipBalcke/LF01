import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsummen {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        System.out.println("Bis zur welcher ganzen Zahl soll die Quadratsumme berechnet werden? ");
        text = br.readLine();
        double zahl = Double.parseDouble(text.replace(',', '.'));

        for (int n = 1; n <= zahl; n++) {
            if (zahl >= 0) {
                double Quadratsumme =
                System.out.println("Quadratsumme von " + zahl + " = " +);

            }
        }
    }

}
