import java.io.IOException;

public class Quadrat {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie groß soll das Quadrat sein?");
        int zahl = IO2.readIngeger();

        for( int i =0; i < zahl; i++) {

            System.out.print("*");
        }
    for ( int i = 0; i < zahl-2; i++) {
        System.out.println(" ");
        System.out.print("*");

    for( int j = 0; j < zahl-2; j++) {
        System.out.print(" ");

    }
        System.out.print("*");
    }
        System.out.println(" ");
        for ( int i = 0; i < zahl; i++ ) {

            System.out.print("*");
        }

    }
}
