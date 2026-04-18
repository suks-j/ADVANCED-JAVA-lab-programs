package lab3b;

public class p13 {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(reverseString(str));
    }
}