package BlattC;

public class BruttoNetto {
    public static void main (String [] args) {
        int MwSt = 19;
        System.out.println("Geben Sie den Bruttopreis an:");
        double Bruttopreis = new java.util.Scanner(System.in).nextDouble();
        double Steuerbetrag = Bruttopreis * MwSt / (100 + MwSt);
        double Nettopreis = Bruttopreis - Steuerbetrag;
        System.out.printf("Das sind " + String.format("%.2f",Nettopreis) + " Euro netto.");
    }
}
