import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenbewertung {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie Ihre Punktzahl ein");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String text = br.readLine();
        int Punkte = Integer.parseInt(text.replace(',' , '.'));


        ;

        if (Punkte < 50) {
            System.out.println("Nicht bestanden. Du musst mehr üben!");
        }
        else if (Punkte < 50) {
            System.out.println("Nicht bestanden. Du musst mehr üben!");
        }
        else if (Punkte < 65) {
            System.out.println("Bestanden (Ausreichend)");
        }
        else if (Punkte < 80) {
            System.out.println("Gut gemacht (Befriedigend)");
        }
        else if (Punkte < 92) {
            System.out.println("Sehr gute Leistung (Gut)!");
        }
        else {
            System.out.println("Hervorragend (Sehr gut)!");
        }




    }


}
