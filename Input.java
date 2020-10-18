import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("Age is " + age);
        String name = scanner.nextLine();
        System.out.println("Name is " + name);
    }
}
