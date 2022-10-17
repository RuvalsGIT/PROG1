public class ScannerExample {
    public static void main (String[] args) {
        System.out.print("Gib bitte Deinen Namen ein: ");
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.print("Hallo, " + name + "! Wie alt bist Du denn? ");
        int age = new java.util.Scanner(System.in).nextInt();

        System.out.println( "Schon " +  " Jahre alt?"
                + "Du hast nur noch " + (67 - age)
                + " Jahre bis zur Rente!");

    }
}

