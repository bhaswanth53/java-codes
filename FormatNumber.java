import java.text.NumberFormat;

public class FormatNumber {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String res = percent.format(0.2);
        System.out.println(res);
    }
}
