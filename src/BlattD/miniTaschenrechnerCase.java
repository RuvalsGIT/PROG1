package BlattD;

public class miniTaschenrechnerCase {
    public static void main (String [] args) {

                System.out.println("Bitte geben Sie die erste Zahl ein");
                double ersteZahl = new java.util.Scanner(System.in).nextDouble();

                System.out.println("Bitte geben Sie den Operator ein");
                String operator = new java.util.Scanner(System.in).nextLine();

                System.out.println("Bitte geben Sie die zweite Zahl ein");
                double zweiteZahl = new java.util.Scanner(System.in).nextDouble();

                if (operator.equals("/") && zweiteZahl == 0) {
                    System.out.println("Man kann durch 0 nicht teilen");
                    System.exit(0);
        }

                switch (operator) {

                    case "+":{
                        System.out.println(ersteZahl + zweiteZahl);
                        break;
                    }
                    case "-":{
                        System.out.println(ersteZahl - zweiteZahl);
                        break;
                    }
                    case "*":{
                        System.out.println(ersteZahl * zweiteZahl);
                        break;
                    }
                    case "/":{
                        System.out.println(ersteZahl / zweiteZahl);
                        break;
                    }
                    default: {
                        System.out.println("Unzulässiger Operator");
                        break;
                    }
                }
    }
}
