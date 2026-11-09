import java.io.IOException;

public class PQ_FormelXXL {

    public static void main(String[] args) throws IOException {
        do {
            System.out.print("Geben sie a ein: ");
            double a = IO.readDouble();

            System.out.print("Geben sie b ein: ");
            double b = IO.readDouble();

            System.out.print("Geben sie c ein: ");
            double c = IO.readDouble();

            double d = Math.pow(b,2) - 4 * a * c;
            if (d < 0) {
                System.out.println("Es gibt keine Lösung");
            } else if (d == 0) {

                double x1 = ((b * -1));
                System.out.println("DIe Lösung ist: " + x1);
            } else  {

                double x1 = (b * -1) + Math.sqrt(Math.pow(b,2) - 4 * a * c) / (2 * a);
                double x2 = (b * -1) - Math.sqrt(Math.pow(b,2) - 4 * a * c) / (2 * a);

                System.out.println("Lösung X1 = " + x2);
                System.out.println("Lösung X2 = " + x2);

            }




            System.out.println("Wollen Sie eine weitere Rechnung durchführen dann geben sie [j] ein");
        }while (IO.readBoolean());



    } // main()

} // class QuadratischeGleichungen

