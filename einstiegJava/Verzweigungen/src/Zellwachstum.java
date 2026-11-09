import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Bitte die aktuelle Zellmenge eingeben: ");
            int zellmenge = IO.readInteger();
            System.out.print("Bitte den Wachstumsfaktor eingeben: ");
            int wachstumsfaktor = IO.readInteger();//(text.replace('.', ','));
            System.out.print("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
            int laufzeit = IO.readInteger();


            for (int i = 0; i <= laufzeit; i++) {
              ;
                System.out.println("Tag: " + i);
                System.out.println("Zellmenge: " + zellmenge);
                System.out.println("----------------------------------");


                zellmenge = zellmenge * wachstumsfaktor;


            }

            System.out.println("Wollen Sie eine weiter Rechnung durchführen dann geben Sie [j] ein");
        } while (IO.readBoolean());


    }
}
