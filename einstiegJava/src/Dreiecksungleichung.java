public class Dreiecksungleichung {

    public static void main(String[] args) {

        double a = 15;
        double b = 30;
        double c = 20;


        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist möglich");
        } else {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist nicht möglich");
        }

    }
}