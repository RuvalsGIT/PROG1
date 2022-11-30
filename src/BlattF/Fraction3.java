package BlattF;

public class Fraction3 {
    int numerator;
    int denominator;

    int result;

    void add(Fraction3 op) {
        numerator = (numerator * op.denominator) +
                (op.numerator * denominator);
        denominator = denominator * op.denominator;
    }

    void sub(Fraction3 op) {
        numerator = (numerator * op.denominator) -
                (op.numerator * denominator);
        denominator = denominator * op.denominator;
    }

    void mul(Fraction3 op) {
        numerator = numerator * op.numerator;
        denominator = denominator * op.denominator;
    }

    void div(Fraction3 op) {
        numerator = numerator * op.denominator;
        denominator = denominator * op.numerator;
    }

    double toDouble() {
        return (double) numerator / (double) denominator;
    }


        void reduce(Fraction3 op) {
            if (numerator == 0){
                result = denominator;
            }
            else {
                while (denominator != 0){
                    if(numerator > denominator) {
                        numerator = numerator - denominator;
                    }
                    else{
                        denominator = denominator - numerator;
                        result = numerator;
                    }
                }
            }

        }

    }

