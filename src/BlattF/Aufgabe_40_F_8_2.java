package BlattF;

public class Aufgabe_40_F_8_2 {
    public static void main(String[] args) {
        System.out.println("Gibt eine Zahl über 0 an: ");
        int n = new java.util.Scanner(System.in).nextInt();

        for(int counter = 0; n!=1; counter++ )
            if (n == 1) {
                break;
            }

            else {
                for (; n % 2 == 0; n = n / 2) {
                    System.out.println(n);
                }
                for (; n % 2 == 0; n = 3 * n + 1) {
                    System.out.println(n);
                }
            }
        }
    }
