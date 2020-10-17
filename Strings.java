public class Strings {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message);
        String hello = "Hello World" + "!!";
        System.out.println(hello);
        if(hello.endsWith("!!")) {
            System.out.println("String ends with !!");
        } else {
            System.out.println("String doesn't end with !!");
        }
        if(hello.startsWith("!!"))
        {
            System.out.println("String starts with !!");
        } else {
            System.out.println("String doesn't start with !!");
        }
        System.out.println("Length of string is" + hello.length());
        System.out.println("Index of e" + hello.indexOf("e"));
        System.out.println("Replaced string is: " + hello.replace("!", "*"));
        System.out.println("Lower case: " + hello.toLowerCase());
        System.out.println("Upper Case: " + hello.toUpperCase());
    }
}
