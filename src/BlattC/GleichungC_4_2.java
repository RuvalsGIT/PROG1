package BlattC;

public class GleichungC_4_2 {
    public static void main(String [] args) {
        System.out.println("Gebe X ein");
        double x = new java.util.Scanner(System.in).nextDouble();

        double Ergebnis = 3 * Math.pow(x,2)  - 8 * x + 4;
        System.out.println(Ergebnis);
    }
}
