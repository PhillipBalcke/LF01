import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class BMI {
    public static void main(String[] args) throws IOException {

        boolean weiter = false;

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
        double BMI = BerechnungBMI(gewicht, Koerpergroesse);
        System.out.println("der beitrag von BMI ist: " + BMI);


        switch (geschlecht.toLowerCase()) {

            case "m":
                AuswertungBmiMann(BMI);
                break;

            case "w":
                AuswertungBmiFrau(BMI);
                break;

            default:
                System.out.println("Unbekanntes Geschlecht eingegebe");
                break;
        }

        do {
            System.out.println("Wollen Sie eine weitere Rechnung durchführen, dann geben Sie [j] ein");
            String wiederholen = br.readLine();
            if (wiederholen.equals("j") || (wiederholen.equals("J"))) {

                weiter = true;
            }


        } while (weiter);

    }

    private static double BerechnungBMI(double gewicht, double Koerpergroesse) {
        return gewicht / ((Koerpergroesse / 100.0) * (Koerpergroesse / 100.0));
    }


    private static void AuswertungBmiMann(double BMI) {
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

    }

    private static void AuswertungBmiFrau(double BMI) {
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

    }


}
