import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noten {
    public static void main(String[] args) throws IOException{

        System.out.println("Geben sie Ihren Prozentwert ein: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        double prozentWert = Double.parseDouble(text.replace(',', '.'));


        int note;



        if (prozentWert >= 85) {
            note = 1;
        } else if (prozentWert >= 73) {
            note = 2;
        } else if (prozentWert >= 59) {
            note = 3;
        } else if (prozentWert >= 45) {
            note = 4;
        } else if (prozentWert >= 27) {
            note = 5;
        } else {
            note = 6;
        }

        System.out.println("prozentWert = " + prozentWert);
        System.out.println("note = " + note);

    }


}
