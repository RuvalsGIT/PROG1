package BlattE;

public class zahlenRaten_do_While {
    public static void main (String [] args) {
        int zufallsZahl = (int)(Math.random()*10);

        System.out.println("Bitte rate eine Zahl zwischen 0-9");
        int raten = new java.util.Scanner(System.in).nextInt();

        int counter = 0;

        boolean richtig;

        do {
            System.out.println("Schade die Zahl ist falsch, rate nochmal");
            counter++;
            raten = new java.util.Scanner(System.in).nextInt();
            richtig = raten == zufallsZahl;
        } while (!richtig);

        System.out.println("Die Zahl " + zufallsZahl + " ist richtig!");
        System.out.println("Versuche: " + counter);
    }
}
