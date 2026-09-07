import java.sql.SQLOutput;

public class Regen {
    public static void main(String[] args) {

        double aprilRM = 7;
        double maiRM = 8;
        double juniRM = 10;
        double durchschnittRegen = (aprilRM + maiRM + juniRM) /3;

        System.out.println("aprilRM = " + aprilRM);
        System.out.println(" maiRM = " +  maiRM);
        System.out.println("JuniRm = " +  juniRM);

        System.out.println("durchschnittRegen: " + durchschnittRegen);



    }
}
