import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Maxima {
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Geben Sie bitte -100 ein, wenn Sie mit der Erfassung der Werte fertig sind.");
            System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein: ");
            System.out.print("Wie viele Werte? ");
            double werte = IO.readDouble();

            final List<Double> ListOfWerten = new ArrayList<Double>();

            double wert = 0;
            while (true) {
                wert++;
                System.out.printf("%nBitte geben Sie den Wert" + "\t" + wert + " ein: ");
                double eingabe = IO.readDouble();
                if (eingabe <= -100) {
                    break;
                }
                ListOfWerten.add(eingabe);
            }

            if (ListOfWerten.isEmpty());
            System.out.println("Abbruch - Sie haben keine Werte erfasst.");
            return;

            double maxWert = -1000.00;
            for(final double eingabe : ListOfWerten) {
                if (wert > maxWert) {
                    maxWert = wert;
                }
            }

            System.out.println("Die größte Zahl ist" + maxWert);









        }while (IO.readBoolean());

    }
}
