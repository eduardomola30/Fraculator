public class FracBonus {
        private int numerator;
        private int denominator;
public FracBonus(int a, int b)
        {
            numerator = a;
            if(b == 0)
                denominator = 1;
            else
                denominator = b;
        }
        public FracBonus plus (FracBonus r)
        {
            reduce();
            int num, den;
            den = denominator * r.getDenominator();
            num = numerator * r.getDenominator() + r.getNumerator() * denominator;
            return new FracBonus(num, den);
        }

        public int getNumerator() { return numerator; }
        public int getDenominator() { return denominator; }
        public String toString () { return numerator + "/" + denominator; }
        public void reduce() {
        int factor;
        factor = gcd(numerator, denominator);
        numerator = numerator / factor;
        denominator = denominator / factor;
    }
        int gcd (int x, int y) {
        int t;
        while (y>0) {
            t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

}
