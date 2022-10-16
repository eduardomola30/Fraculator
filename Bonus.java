import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int denom;

        System.out.println("Enter first numerator: ");
        num = input.nextInt();

        System.out.println("Enter first denominator: ");
        denom = input.nextInt();

        FracBonus x = new FracBonus(num, denom);

        System.out.println("Enter second numerator: ");
        num = input.nextInt();

        System.out.println("Enter second denominator: ");
        denom = input.nextInt();

        FracBonus y = new FracBonus(num, denom);

        FracBonus z = x.plus(y);
        z.reduce();

        System.out.println(x.getNumerator()+"/"+x.getDenominator()+" + "+ y.getNumerator()+"/"+ y.getDenominator()+" = "+ z);

    }
}
