import java.io.IOException;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Bitte Kapital eingeben: ");
            double kapital = IO.readDouble();
            System.out.print("Bitte den Zinssatz eingeben: ");
            double zinssatz = IO.readDouble();
            System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
            double laufzeit = IO.readDouble();

            System.out.println("Jahr"+"\t\t\t"+"Anfangskapital"+"\t\t\t"+"Zinsbetrag"+"\t\t\tJahresendbetrag");

            for (int i = 1; i <= laufzeit; i++) {
                double zinsbetrag = kapital * (zinssatz / 100);
                double jahresendbetrag = kapital + zinsbetrag;
                System.out.println(i + "\t\t\t");
                System.out.println(kapital + "\t\t\t");
                System.out.println(zinsbetrag + "\t\t\t");
                System.out.println(jahresendbetrag + "\t\t\t");
                kapital = jahresendbetrag;


            }
            System.out.println("Wollen Sie eine weiter Rechnung durchführen dann geben sie [j] ein");
        }while (IO.readBoolean());
    }
}
