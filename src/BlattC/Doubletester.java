package BlattC;

public class Doubletester {
        public static void main (String [] args) {
            System.out.println("Gebe a einen Wert");
            double a = new java.util.Scanner(System.in).nextInt();
            System.out.println("Gebe b einen Wert");
            double b = new java.util.Scanner(System.in).nextInt();

            double Re1 = a + b;
            double Re2 = a - b;
            double Re3 = a * b;
            double Re4 = a / b;
            double Re5 = a % b;

            System.out.printf(Re1 + "%n" + Re2 + "%n" + Re3 + "%n" + Re4 + "%n" + Re5);

        }
}
