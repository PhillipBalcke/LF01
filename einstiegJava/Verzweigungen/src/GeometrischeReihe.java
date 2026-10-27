import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Wie viele Durchgänge möchten Sie berechnen");
        String text = br.readLine();
        int n = Integer.parseInt(text.replace(',' , '.'));

       double x;
       double y = 2;
       double zahl = 0;

       for( int i = 0; i < n; i++ ) {


           x = 1 / y;
           zahl = zahl + x;

           y = y * 2;

       }
        System.out.println("Das Ergebniss lautet: " + zahl);


    }


}
