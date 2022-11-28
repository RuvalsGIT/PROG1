package BlattC;

public class IntTester {
    public static void main (String [] args) {
        System.out.println("Gebe a einen Wert");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Gebe b einen Wert");
        int b = new java.util.Scanner(System.in).nextInt();

        int Re1 = a + b;
        int Re2 = a - b;
        int Re3 = a * b;
        int Re4 = a / b;
        int Re5 = a % b;

        System.out.printf(Re1 + "%n" + Re2 + "%n" + Re3 + "%n" + Re4 + "%n" + Re5);

    }
}
