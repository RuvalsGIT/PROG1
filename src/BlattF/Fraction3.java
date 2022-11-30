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
        int a = numerator;
        int b = denominator;
            if (a == 0){
                result = b;
            }
            else {
                while (b != 0){
                    if(a > b) {
                        a = a - b;
                    }
                    else{
                        b = b - a;
                        result = a;
                    }
                }
            }
            numerator = numerator / result;
            denominator = denominator / result;
        }


    }

