package BlattE;

public class zahlenRaten_Highscore {
    public static void main (String [] args) {
        int zufallsZahl = (int)(Math.random() * 10);
        System.out.println(zufallsZahl);
        System.out.println("Bitte raten Sie eine Zahl von 0-9");
        int geraten = new java.util.Scanner(System.in).nextInt();
        boolean richtig = geraten == zufallsZahl;
        int counter = 0;
        int counterVersuche = 5;
        counter++;

        if (richtig == true) {
            System.out.println("Sehr gut, das hast du auf den ersten Versuch geschafft!");
        }

        else {
            while (!richtig) {
                counter++;
                counterVersuche--;
                if (counterVersuche == 0) {
                    System.out.println("Falsch, du hast keine Versuche mehr -> Game Over");
                    break;
                }

                System.out.println("Die Zahl ist nicht korrekt, bitte rate nochmals");
                if (geraten > zufallsZahl) {
                    System.out.println("Tipp: kleiner");
                }
                if (geraten < zufallsZahl) {
                    System.out.println("Tipp: größer");
                }
                if (counterVersuche == 1) {
                    System.out.println("Achtung! Last try!");
                }
                System.out.println("Versuche übrig: " + counterVersuche);
                geraten = new java.util.Scanner(System.in).nextInt();
                richtig = geraten == zufallsZahl;

                if (richtig == true) {
                    System.out.println("Sehr gut! Du hast es richtig geraten");
                    System.out.println("Versuche gebraucht: " + counter);
                }
            }
        }
        }
    }


