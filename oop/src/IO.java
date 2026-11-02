import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static String readString() throws IOException {
        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {

        while (true) {
            try {
                String eingabe = readString();
                int ganzzahl = Integer.parseInt(eingabe.trim());
                return ganzzahl;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Keine Ganzzahl! Bitte erneut versuchen");
            }
        }
    }

    public static double readDouble() throws IOException {

        while (true) {
            try {
                String eingabe = readString();
                double kommazahl = Double.parseDouble(eingabe.replace(',', '.'));
                return kommazahl;
            } catch (NumberFormatException | IOException e) {
                System.out.println("keine Kommazahl! Bitte erneut versuchen");
            }
        }
    }

    public static boolean readBoolean() throws IOException {
        while (true) {
            try {
                String eingabeString = readString().toLowerCase();
                switch (eingabeString) {
                    case "j", "y", "ja", "yes", "yp":
                        return true;
                    case "nein", "no", "n", "nope":
                        return false;
                    default:
                        System.out.println("Ungültige Eingabe! Bitte erneut versuchen: ");

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}




