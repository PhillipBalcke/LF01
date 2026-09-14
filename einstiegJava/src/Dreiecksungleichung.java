public class Dreiecksungleichung {

    public static void main(String[] args) {

        double a = 6;
        double b = 3;
        double c = 5;


        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist möglich");
        } else {
            System.out.println("Das Zeichnen eines Dreiecks mit den Seitenlängen ist nicht möglich");
        }

        double s = ( a + c + b) /2;
        double e = (a + b +c);
        double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Flächeninhalt eines Dreiecks" + " = " + A);
        System.out.println("Umfang eines Dreiecks" + " = " + e);


    }
}