import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for(byte i = 0; i < 5; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("Length is: " + nums.length);
    }
}
