package BlattF;

public class Aufgabe_38 {
    public static void main(String[] args) {
        System.out.println("Gib eine Zahl die größer als 0 ist an:");
        int n = new java.util.Scanner(System.in).nextInt();
        int counter = 1;
        int max = n;

        while (n > 0) {
            while (max < n){
                max = n;
            }
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = 3 * n + 1;
            }
            System.out.println(n + " " + counter);
        if (n == 1) {
            break;
        }
        counter++;
        }
        System.out.println("");
    }

}
