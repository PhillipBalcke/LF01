import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schaltjahr {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie Ihr Jahr ein");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int Jahr = Integer.parseInt(text.replace(',' , '.'));

        int jahr = 2024; // Beispielwert

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.println("Schaltjahr!");
                } else {
                    System.out.println("Kein Schaltjahr!");
                }
            } else {
                System.out.println("Schaltjahr!");
            }
        } else {
            System.out.println("Kein Schaltjahr!");
        }







    }
}
