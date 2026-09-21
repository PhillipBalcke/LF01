import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenRechnerBufferedReader {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Geben sie Ihre erste Zahl ein: ");
        String text = br.readLine();
        double zahl1 = Double.parseDouble(text.replace(',', '.'));

        System.out.println(" Geben sie Ihre zweite Zahl ein: ");
        text = br.readLine();
        double zahl2 = Double.parseDouble(text.replace(',', '.'));


        double summe = zahl1 + zahl2;
        double produkt = zahl1 * zahl2;
        double differenz = zahl1 - zahl2;
        double quotient = zahl1 / zahl2;

        System.out.println(" Zahl X: " + zahl1);
        System.out.println("Zahl Y: " + zahl2);

        /*
        System.out.println("Geben sie Ihre Rechenoperation ein");
        String operation = br.readLine();

        if  operation.equals("+")) {
            System.out.println("Summe " + zahl1 + zahl2);
        }
            else if (operation.equals("*")) {
            System.out.println("Produkt " + zahl1 * zahl2);
        }
            else if (operation.equals("-")) {
            System.out.println("differenz " + (zahl1 - zahl2));
        }
            else if (operation.equals("/")) {
            System.out.println("Quotient " + zahl1 / zahl2);
        }  */

        System.out.println("Geben Sie Ihre Rechenoperation ein");
        String operation = br.readLine();

        switch (operation) {
            case "+":
                System.out.println("Summe " + (zahl1 + zahl2));
                break;
            case "*":
                System.out.println("Produkt " + (zahl1 * zahl2));
                break;
            case "-":
                System.out.println("differenz " + (zahl1 - zahl2));
                break;
            case "/":
                System.out.println("Quotient " + (zahl1 / zahl2));
                break;
            default:
                System.out.println("Ungültige Operation!");
                break;
        }

    }

    }







