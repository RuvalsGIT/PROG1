package BlattD;

public class ifSchalter {
    public static void main (String [] args) {

        System.out.println("Ist der Schalter A an? Antworte mit true or false");
        boolean SchalterA = new java.util.Scanner(System.in).nextBoolean();

        System.out.println("Ist der Schalter B an? Antworte mit true or false");
        boolean SchalterB = new java.util.Scanner(System.in).nextBoolean();

        boolean Leuchten = SchalterA ^ SchalterB;

        if (Leuchten) {
            System.out.println("Das Licht ist an");
        }
        else {
            System.out.println("Das Licht ist aus");
        }
    }
}

