import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsummen {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Bis zur welcher ganzen Zahl soll die Quadratsumme berechnet werden? ");
        String text = br.readLine();
        double zahl = Double.parseDouble(text.replace(',', '.'));

        double x = 1;
        double y = 0;
        double z = 0;

        for (int n = 1; n <= zahl; n++) {

            y = x * x;
            z = z + y;





                x = x+1;

            }
            System.out.println("Quadratsumme von " + zahl + " = " + z);

    }

    }


