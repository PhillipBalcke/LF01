import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind Sie?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int alter = Integer.parseInt(text.replace(',', '.'));





        if (alter >= 18) {
            System.out.println("Du bist schon Volljährig!");
        }

        else {
            System.out.println("Du bist noch minderjährig!");
        }






    }


}
