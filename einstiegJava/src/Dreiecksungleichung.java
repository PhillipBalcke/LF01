import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {

    public static void main(String[] args) throws IOException {
        System.out.println("Geben sie Seite a ein: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        double a = Double.parseDouble(text.replace(',', '.'));
        System.out.println(" Geben sie Seite b ein");
         text = br.readLine();
        double b = Double.parseDouble(text.replace(',', '.'));

        System.out.println(" Geben sie Seite c ein");
         text = br.readLine();
        double c = Double.parseDouble(text.replace(',', '.'));



        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist möglich");
        } else {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist nicht möglich");
        }

        double s = ( a + c + b) /2;
        double e = (a + b +c);
        double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Flächeninhalt eines Dreiecks" + " = " + A);
        System.out.println("Umfang eines Dreiecks" + " = " + e);


    }
}