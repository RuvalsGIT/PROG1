package BlattC;

public class Schalter {
    public static void main (String [] args) {

        System.out.println("Ist der BlattC.Schalter A an? Antworte mit true or false");
        boolean SchalterA = new java.util.Scanner(System.in).nextBoolean();

        System.out.println("Ist der BlattC.Schalter B an? Antworte mit true or false");
        boolean SchalterB = new java.util.Scanner(System.in).nextBoolean();

        boolean Leuchten = SchalterA ^ SchalterB;

        System.out.println("Ist das Licht gerade an?: " + Leuchten);
    }
}
