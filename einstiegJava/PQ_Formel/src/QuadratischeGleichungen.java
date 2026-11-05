import java.io.IOException;

public class QuadratischeGleichungen {
    public static void main(String[] args) throws IOException {
        System.out.println("Geben sie p ein: ");
        double p = IO.readDouble();
        System.out.println("Geben sie q ein: ");
        double q = IO.readDouble();
        double x = IO.readDouble();

        double x1;
        double x2;

        double zwischenergebniss = Math.pow(x,2);
        double endergebniss = (p*x+q);

        double summe = zwischenergebniss + endergebniss;

        x1 = p/2 + Math.sqrt(p/2) + -q;

        x2 = p/2 - Math.sqrt(p/2) + -q;


    }

}
