import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind sie?");
        String alter = IO.readString();

        System.out.println("Sie sind " + alter + " " + "Jahre alt");

        System.out.println("Geben das aktuelle jahr an");
        int jahr = IO.readIngeger();

        System.out.println("Das aktuelle Jahr ist " + jahr);

        System.out.println("Gebn sie Ihren Notendurchschnitt an");
        double Notendurchschnitt = IO.readDouble();

        System.out.println("Sie haben einen Notendurchschnitt von " + Notendurchschnitt);




    }

}
