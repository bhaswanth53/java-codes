import java.util.Arrays;
import java.util.Scanner;

public class SingleLineInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] list = new String[5][];
        for(byte i = 0; i < 5; i++) {
            String[] line = scanner.nextLine().split(" ");
            list[i] = line;
        }
        System.out.println(Arrays.deepToString(list));
        scanner.close();
    }
}