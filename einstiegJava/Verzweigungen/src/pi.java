import java.io.IOException;

public class pi {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie eine Zahl ein:");
        double zahl = IO.readDouble();

        double summe =0;
        double term;
        for (int n = 0; n <= zahl; n++) {

        term = Math.pow(-1,n) / (2 * n + 1);

        summe += term;
        }

        double ergebniss = 4 * summe;
        double abweichung = (Math.PI - ergebniss);

        System.out.println("Das Ergebnis lautet: " + ergebniss);
        System.out.println("Echtes Pi (Math.PI): " + Math.PI);
        System.out.println("Abweichung:: " + abweichung);



    }
}





