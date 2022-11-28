package BlattD;

public class mini_Taschenrechner {
    public static void main (String [] args) {
        System.out.println("Bitte geben Sie die erste Zahl ein");
        double ersteZahl = new java.util.Scanner(System.in).nextDouble();

        System.out.println("Bitte geben Sie den Operator ein");
        String operator = new java.util.Scanner(System.in).nextLine();

        System.out.println("Bitte geben Sie die zweite Zahl ein");
        double zweiteZahl = new java.util.Scanner(System.in).nextDouble();

        if (operator.equals("+")) {
            System.out.println("Ergebnis ist: " + (ersteZahl + zweiteZahl));
        }
        else if (operator.equals("-")){
            System.out.println("Ergebnis ist: " + (ersteZahl - zweiteZahl));
        }
        else if (operator.equals("*")){
            System.out.println("Ergebnis ist: " + (ersteZahl * zweiteZahl));
        }
        else if (operator.equals("/")){
            System.out.println("Ergebnis ist: " + (ersteZahl / zweiteZahl));
        }
        else
            System.out.println("Der Operator ist nicht gültig");


    }

}
