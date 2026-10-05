import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static String readString() throws IOException {
        String text = br.readLine();
        return text;
    }

    public static int readIngeger() throws IOException {

        while (true) {
            try {
                String eingabe = readString();
                int ganzzahl = Integer.parseInt(eingabe.replace(',', '.'));
                return ganzzahl;
            }   catch (NumberFormatException | IOException e) {
                System.out.println("Keine Ganzzahl! Bitte erneut versuchen");
            }


        }


    }
}