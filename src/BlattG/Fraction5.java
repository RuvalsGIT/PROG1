package BlattG;

public class Fraction5 {
        int numerator;
        int denominator;
        Fraction5() {
            numerator = 0;
            denominator = 1;
            System.out.println("Fraction5::Fraction5()");
        }
        Fraction5(int n, int d) {
            numerator = n;
            denominator = d;
            System.out.println("Fraction5::Fraction5(int, int)");
        }

        Fraction5(int n) {
            this(n,1);
            System.out.println("Fraction5::Fraction5(int)");
        }
}
