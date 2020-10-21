import java.util.Arrays;
import java.util.Scanner;

public class SingleLineInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte size = scanner.nextByte();
        String[][] list = new String[size][];
        for(byte i = 0; i < size; i++) {
            String[] line = scanner.nextLine().split(" ");
            list[i] = line;
        }
        System.out.println(Arrays.deepToString(list));
        scanner.close();
    }
}