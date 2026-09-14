import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeDoWhile {


        public static void main(String[] args)  throws IOException {
            System.out.println("Geben sie Ihre Summe ein:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String text = br.readLine();
            double grenze = Double.parseDouble(text.replace(',', '.'));


          int summe = 0;

          do {
              System.out.println(summe);

              summe = summe + 1;
          } while (summe >= grenze);

          }

            }



