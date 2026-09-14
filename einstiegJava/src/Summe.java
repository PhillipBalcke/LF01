import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summe {

    public static void main(String[] args)  throws IOException {
        System.out.println("Geben sie Ihre Summe ein:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        double summe = Double.parseDouble(text.replace(',', '.'));


        summe = 0;
        double summand = 1;

        while (summand <=10) {


            summe = summe + summand;
        summand = summand +1;


        System.out.println("Die Summe ist" + " = " + summe);




        }

    }

}
