package BlattC;

public class InterestRate {
    public static void main(String [] args) {
        System.out.println("Wie viel Kapital möchten Sie investieren?");
        double kapital = new java.util.Scanner(System.in).nextInt();

        System.out.println("Bitte geben Sie den prozentualen Zinssatz an:");
        double zins = new java.util.Scanner(System.in).nextInt();

        System.out.println("Wie lange ist die Laufzeit in Jahren ihrer Investition");
        double laufzeit = new java.util.Scanner(System.in).nextInt();

        double angespartesKapital = kapital * Math.pow(1 + (zins / 100),laufzeit);
        System.out.println("Sie werden nach " + laufzeit + " Jahren so viel Kapital haben: " + angespartesKapital);

        System.out.println("Gerundet sind das: " + String.format("%.2f",angespartesKapital));

    }
}
// B3C

