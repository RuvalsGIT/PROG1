package BlattE;

public class zahlenRaten_HilfeStellung {
    public static void main (String [] args) {
        int zufallsZahl = (int)(Math.random() * 10);
        System.out.println("Bitte raten Sie eine Zahl von 0-9");
        int geraten = new java.util.Scanner(System.in).nextInt();

        boolean richtig = geraten == zufallsZahl;
        int counter = 0;

        while (!richtig) {

            System.out.println("Die Zahl ist nicht korrekt, bitte rate nochmals");
            if (geraten > zufallsZahl) {
                System.out.println("Tipp: kleiner");
            }
            if (geraten < zufallsZahl) {
                System.out.println("Tipp: größer");
            }
            geraten = new java.util.Scanner(System.in).nextInt();
            counter++;
            richtig = geraten == zufallsZahl;

        }

        System.out.println("Gut geraten, die Zahl " + zufallsZahl + " ist richtig!");
        System.out.println("Versuche: " + counter);
    }
}
