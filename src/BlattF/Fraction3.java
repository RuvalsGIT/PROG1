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
        op.numerator =-op.numerator;
        add(op);
//        numerator = (numerator * op.denominator) -
//                    (op.numerator * denominator);
//        denominator = denominator * op.denominator;
    }

    void mul(Fraction3 op) {
        numerator = numerator * op.numerator;
        denominator = denominator * op.denominator;
    }

    void div(Fraction3 op) {
        Fraction3 tausch = new Fraction3();
        tausch.numerator = op.denominator;
        tausch.denominator = op.numerator;
        mul(tausch);
    }

    double toDouble() {
        return (double) numerator / (double) denominator;
    }


        void reduce(Fraction3 op) {
        gtc(numerator, denominator);


        numerator = numerator / result;
        denominator = denominator / result;
        }

        int gtc(int a, int b){

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
            return result;
        }
    }