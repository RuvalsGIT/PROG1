package BlattC;

public class Modulo {
    public static void main (String [] args) {
    System.out.println("Bitte geben Sie den Dividend an");
    int dividend = new java.util.Scanner(System.in).nextInt();

    System.out.println("Bitte geben Sie den Divisor an");
    int divisor = new java.util.Scanner(System.in).nextInt();

    int quotient = dividend / divisor;
    int rest = dividend % divisor;
    System.out.println(dividend + " / " + divisor + " = " + quotient + " Rest: " + rest);
    }
}
