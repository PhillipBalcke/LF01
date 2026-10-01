import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ticketrechner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double basispreis = 25;
        double rabattgutschein = 2;
        String gutschein = "";

        System.out.println("Wie alt sind sie?: ");
        String text = br.readLine();
        int alter = Integer.parseInt(text.replace(',', '.'));

        System.out.println("Haben sie einen Rabbatgutschein?: ");
        text = br.readLine();

        System.out.println(rabattgutschein);
        switch (gutschein.toLowerCase()) {

            case "ja":
                if (alter < 4) {
                    System.out.println("Ihre Reise ist kostenfrei");
                    double tageskarte = basispreis / 100.0 - 2;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter <= 17) {
                    System.out.println("Sie erhalten einen Rabatt von 40%");
                    double tageskarte = basispreis / 100.0 * 60 - 2;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter <= 64) {
                    System.out.println("Sie müssen den vollen Basispreis bezahlen");
                    double tageskarte = basispreis - 2;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter >= 65) {
                    System.out.println("Sie erhalten eine Ermäßigung von 20%");
                    double tageskarte = basispreis / 100.0 * 80 - 2;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                }

            case "n":

                if (alter < 4) {
                    System.out.println("Ihre Reise ist kostenfrei");
                    double tageskarte = basispreis / 100.0;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter <= 17) {
                    System.out.println("Sie erhalten einen Rabatt von 40%");
                    double tageskarte = basispreis / 100.0 * 60;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter <= 64) {
                    System.out.println("Sie müssen den vollen Basispreis bezahlen");
                    double tageskarte = basispreis;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                } else if (alter >= 65) {
                    System.out.println("Sie erhalten eine Ermäßigung von 20%");
                    double tageskarte = basispreis / 100.0 * 80;
                    System.out.println("Der Preis beträgt: " + tageskarte);
                }
        }

        }


    }
