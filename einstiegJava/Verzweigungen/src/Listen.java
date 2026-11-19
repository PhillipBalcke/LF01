import java.io.IOException;

public class Listen {

    public static void main(String[] args) throws IOException {
        System.out.print("Geben Sie die Anzahl der Tage ein: ");
        int anzahltage = IO.readInteger();
        double[] tage = new double[anzahltage];
        for(int i = 0; i < tage.length; i++) {
            System.out.print("Temperatur an Tag"+ "\t" + (i+1) +  ":");
            tage[i] = IO.readDouble();

        }

        for (int i = 0; i < tage.length; i++) {

        }
        int i = 0;
        double mittelwert =  anzahltage / tage[i];
        System.out.println("Der Mittelwert beträgt:" + mittelwert);


    }
}
