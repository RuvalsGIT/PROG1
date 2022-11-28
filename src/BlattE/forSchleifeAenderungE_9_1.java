package BlattE;

public class forSchleifeAenderungE_9_1 {
    public static void main (String [] args){
        for (int zeilenCounter = 0; zeilenCounter < 5; zeilenCounter++) {
            for (int counter = 1; counter < 6; counter++) {
                if (counter % 2 == 0){
                    System.out.print(".");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
    }
    }
}
