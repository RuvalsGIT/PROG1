package BlattE;

public class forSchleifeAenderungE_9_2 {
    public static void main(String[] args) {
        for (int zeilenCounter = 1; zeilenCounter < 6; zeilenCounter++) {
            for (int counter = 0; counter < 5; counter++) {
                if (zeilenCounter <= counter) {
                    System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
