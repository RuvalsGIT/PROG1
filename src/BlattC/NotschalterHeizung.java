package BlattC;

public class NotschalterHeizung {
    public static void main (String [] args) {

        System.out.println("Ist der Notschalter 1 an? Antworte mit true or false");
        boolean Notschalter1 = new java.util.Scanner(System.in).nextBoolean();

        System.out.println("Ist der Notschalter 2 an? Antworte mit true or false");
        boolean Notschalter2 = new java.util.Scanner(System.in).nextBoolean();

        boolean HeizungAn = !Notschalter1 && !Notschalter2;
        System.out.println("Ist die Heizung an?:" + HeizungAn);
    }
}
