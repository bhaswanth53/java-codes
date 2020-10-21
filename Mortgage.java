import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("\nAnnual Interest Rate: ");
        double air = scanner.nextDouble();
        System.out.print("\nPreiod(Years): ");
        int period = scanner.nextInt();
        scanner.close();

        double r = air / 100;
        float n = period * 12;

        double step1 = r*(Math.pow((1+r), n));
        double step2 = Math.pow((1+r), n) - 1;
        double mortgage = principal * (step1 / step2);

        NumberFormat mort = NumberFormat.getCurrencyInstance();
        String result = mort.format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}