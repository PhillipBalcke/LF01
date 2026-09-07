public class Noten {
    public static void main(String[] args) {

        double prozentWert;
        int note;

        prozentWert = 58.5;

        if (prozentWert >= 85) {
            note = 1;
        } else if (prozentWert >= 73) {
            note = 2;
        } else if (prozentWert >= 59) {
            note = 3;
        } else if (prozentWert >= 45) {
            note = 4;
        } else if (prozentWert >= 27) {
            note = 5;
        } else {
            note = 6;
        }

        System.out.println("prozentWert = " + prozentWert);
        System.out.println("note = " + note);


    }


}
