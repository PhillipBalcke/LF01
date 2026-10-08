import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind sie?");
        String alter = IO.readString();

        System.out.println("Sie sind " + alter + " " + "Jahre alt");




    }

}
