import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TaschenRechnerBufferedReader {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean weiter = true;

        do {
            //Menü
            System.out.println("Folgende Rechenoperationen stehen zur Auswahl");
            System.out.println("[+] für Addition");
            System.out.println("[-] für Subtraktion");
            System.out.println("[*] für Multiplikation");
            System.out.println("[/] für Division");
            System.out.println("[p] für Potenzieren");
            System.out.println("[w] für Wurzelziehen");
            System.out.println("Deine Auswhal: ");

            System.out.println(" Bitte die Basis eingeben: ");
            System.out.println(" Bitte den Exponenten eingeben: ");
            System.out.println("Wollen Sie eine weiter Rechnung durchführen, dann geben Sie [j] ein.");
            String operation = br.readLine();
            // Berechnungen
            switch (operation) {
                case "+":
                    String text = br.readLine();
                    double zahl1 = Double.parseDouble(text.replace(',', '.'));
                    text = br.readLine();
                    double zahl2 = Double.parseDouble(text.replace(',', '.'));
                    System.out.println("Summe " + (zahl1 + zahl2));
                    break;
                case "*":
                    text = br.readLine();
                    zahl1 = Double.parseDouble(text.replace(',', '.'));
                    text = br.readLine();
                    zahl2 = Double.parseDouble(text.replace(',', '.'));
                    System.out.println("Produkt " + (zahl1 * zahl2));
                    break;
                case "-":
                    text = br.readLine();
                    zahl1 = Double.parseDouble(text.replace(',', '.'));
                    text = br.readLine();
                    zahl2 = Double.parseDouble(text.replace(',', '.'));
                    System.out.println("differenz " + (zahl1 - zahl2));
                    break;
                case "/":
                    text = br.readLine();
                    zahl1 = Double.parseDouble(text.replace(',', '.'));
                    text = br.readLine();
                    zahl2 = Double.parseDouble(text.replace(',', '.'));
                    System.out.println("Quotient " + (zahl1 / zahl2));
                    break;
                default:
                    System.out.println("Ungültige Operation!");
                    break;





            /*String text = br.readLine();
            double zahl1 = Double.parseDouble(text.replace(',', '.'));


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

            }

    }
}
