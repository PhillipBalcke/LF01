import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie Ihr Gewicht in Kg ein");
        String text = br.readLine();
        double gewicht = Double.parseDouble(text.replace(',', '.'));

        System.out.println("Geben sie Ihre Körpergröße in cm ein");
        text = br.readLine();
        double Koerpergroesse = Double.parseDouble(text.replace(',', '.'));

        System.out.println("Geben sie Ihr Geschlecht ein");
        String geschlecht = br.readLine();


        //Berechnung
        double BMI = gewicht / (Koerpergroesse * Koerpergroesse);
        System.out.println("der beitrag von BMI ist: " + BMI);

        switch (geschlecht) {

            case "M":
                if (BMI < 20) {
                    System.out.println("Untergewicht");
                } else if (BMI < 25) {
                    System.out.println("Normalgewicht");
                } else if (BMI < 30) {
                    System.out.println("Übergewicht");
                } else if (BMI < 40) {
                    System.out.println("Adipositas");
                } else if (BMI >= 40) {
                    System.out.println("Starke Adipositas");
                }
                break;

            case "W":
                if (BMI < 19) {
                    System.out.println("Untergewichtig");
                } else if (BMI < 24) {
                    System.out.println("Normalgewicht");
                } else if (BMI < 30) {
                    System.out.println("Übergewicht");
                } else if (BMI < 40) {
                    System.out.println("Adipositas");
                } else if (BMI >= 40) {
                    System.out.println("Starke Adipositas");
                }
                break;
            default:
                System.out.println("Unbekanntes Geschlecht eingegebe");
                break;
        }


    }
}