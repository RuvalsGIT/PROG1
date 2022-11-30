package BlattF;

public class Fraction3Main {
    public static void main(String[] args) {
        Fraction3 myFraction1 = new Fraction3();

        myFraction1.numerator = 2;
        myFraction1.denominator = 3;
        myFraction1.result = 1;

        Fraction3 myFraction2 = new Fraction3();
        myFraction2.numerator = 4;
        myFraction2.denominator = 12;

        System.out.println(myFraction1.toDouble());
        System.out.println(myFraction2.toDouble());

        System.out.println(" Wählen sie zwischen, ADD / SUB / MUL / DIV");
        String operator = new java.util.Scanner(System.in).nextLine();

        switch (operator) {

            case "ADD":
                myFraction1.add(myFraction2);
                break;

            case "SUB":
                myFraction1.sub(myFraction2);
                break;

            case "MUL":
                myFraction1.mul(myFraction2);
                break;

            case "DIV":
                myFraction1.div(myFraction2);
                break;
        }

        System.out.println(myFraction1.numerator + " | " + myFraction1.denominator);
        myFraction1.reduce(myFraction1);
        System.out.println("Gemeinsamer Teiler:" + myFraction1.result);
        System.out.println("Gekürzt: " + myFraction1.numerator + " / " + myFraction1.denominator);
        System.out.println(myFraction1.toDouble());

    }
}

