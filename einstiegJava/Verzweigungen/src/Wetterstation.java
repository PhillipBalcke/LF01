import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wetterstation {
    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie Ihre Außentemperatur in °C ein");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        int Temperatur = Integer.parseInt(text.replace(',' , '.'));

        if (Temperatur < 0) {
            System.out.println("Es ist frostig! Zieh dich warm an.");
        }
         else if (Temperatur < 15) {
            System.out.println("Es ist kühl. Eine Jacke wäre gut.");
        }
         else if (Temperatur < 25) {
            System.out.println("Angenehmes Wetter!");
        }
         else  {
            System.out.println("Es ist heiß! Vergiss das Trinken nicht.");
        }
    }
}
