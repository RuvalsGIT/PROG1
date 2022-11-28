package BlattD;

public class Verbrauch_2 {

        public static void main (String [] args ) {

            double grundVerbrauchKraftstoff = 4.7 / 100;
            double grundVerbrauchOel = 0.4 / 1000;

            System.out.println("Wie viele km möchten Sie fahren?");
            double Strecke = new java.util.Scanner(System.in).nextDouble();

            if (Strecke < 0) {
                System.out.println("Die Eingabe war negativ, das Programm wird geschlossen!");
                System.exit(0);
            }


            System.out.println("Wie ist der aktuelle Spritpreis pro Liter?");
            double spritPreis = new java.util.Scanner(System.in).nextDouble();

            if (spritPreis < 0) {
                System.out.println("Die Eingabe war negativ, das Programm wird geschlossen!");
                System.exit(0);
            }


            double verbrauchKraftstoff = Strecke * grundVerbrauchKraftstoff;
            double verbrauchOel = Strecke * grundVerbrauchOel;
            double verbrauchEuro = spritPreis * verbrauchKraftstoff;

            System.out.println("Sie verbrauchen auf der Strecke von " + Strecke + " km. Insgesamt " + String.format("%.2f",verbrauchKraftstoff)
                    + " Liter Kraftstoff, das sind " + String.format("%.2f",verbrauchEuro) + " Euro und zusätzlich "
                    + String.format("%.2f",verbrauchOel) + " Liter Öl.");

        }
    }

