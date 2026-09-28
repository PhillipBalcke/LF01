import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kinokarte {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie Ihr alter ein");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int alter = Integer.parseInt(text.replace(',' , '.'));


        int EintrittKostenu12 = 5;
        int EintrittKostenü12 = 9;


        if (alter < 12) {
            System.out.println("Der Eintritt Kostet: " + EintrittKostenu12);
        }
        else {
            System.out.println("Der Eintritt kostet: " + EintrittKostenü12);
        }

    }
}
