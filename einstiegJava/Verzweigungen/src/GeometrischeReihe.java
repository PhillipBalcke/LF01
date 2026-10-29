import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Wie viele Durchgänge möchten Sie berechnen");
        int n = Integer.parseInt(br.readLine());

      double ergebniss = 0;

       for( int i = 1; i <= n; i++ ) {

           ergebniss = ergebniss + 1/Math.pow(2,i);
       }


        System.out.println("Das Ergebniss lautet: " + ergebniss);


    }


}
