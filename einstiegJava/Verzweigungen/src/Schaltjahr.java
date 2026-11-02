import java.io.IOException;

public class Schaltjahr {
    public static void main(String[] args) throws IOException {


        do {
            System.out.println("Bei welchem Jahr soll Ihre Berechnung starten?");
            int jahrVon = IO.readInteger();
            System.out.println("Bis zu welchem Jahr soll Ihre Berechnung gehen?");
            int jahrBis = IO.readInteger();

            for ( int i = jahrVon; i <= jahrBis; i++) {

                if (i % 4 == 0) {
                    if (i % 100 != 0) {
                        System.out.println(i);
                    }
                    else if (i % 400 == 0) {
                        System.out.println(i);
                    }
                }
            }


            System.out.println("Wollen Sie eine weiter Rechnung durchfrühren dann geben Sie [j] ein");
            String wiederholen = IO.readString();
            if (wiederholen.equals("j") || wiederholen.equals("J"));

        } while (IO.readBoolean());

    }
}
