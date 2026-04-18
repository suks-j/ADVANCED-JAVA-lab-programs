package lab3b;

public class p15 {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println(removeWhitespace(str));
    }
}
