package BlattF;

public class Fraction3Main {
    public static void main (String [] args) {
        Fraction3 myFraction1 = new Fraction3();

        myFraction1.numerator = 2;
        myFraction1.denominator = 3;


        Fraction3 myFraction2 = new Fraction3();
        myFraction2.numerator = 4;
        myFraction2.denominator = 12;

        System.out.println(myFraction1.toDouble());
        System.out.println(myFraction2.toDouble());

        myFraction1.add(myFraction2);
        System.out.println( "ADD " + myFraction1.numerator + "/" + myFraction1.denominator);
        System.out.println(myFraction1.toDouble());

        myFraction1.sub(myFraction2);
        System.out.println("SUB " + myFraction1.numerator + "/" + myFraction1.denominator);
        System.out.println(myFraction1.toDouble());

        myFraction1.mul(myFraction2);
        System.out.println("MUL " + myFraction1.numerator + "/" + myFraction1.denominator);
        System.out.println(myFraction1.toDouble());

        myFraction1.div(myFraction2);
        System.out.println("DIV " + myFraction1.numerator + "/" + myFraction1.denominator);
        System.out.println(myFraction1.toDouble());

    }
    }
