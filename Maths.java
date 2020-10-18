public class Maths {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);
        int result1 = (int) Math.ceil(1.1F);
        System.out.println(result1);
        int result2 = (int) Math.floor(1.1F);
        System.out.println(result2);
        int result3 = Math.max(2, 3);
        System.out.println(result3);
        int result4 = Math.min(6, 4);
        System.out.println(result4);
        double result5 = Math.random();
        System.out.println(result5);
        double result6 = Math.random() * 100;
        System.out.println(result6);
        System.out.println(Math.round(result6));
    }
}
