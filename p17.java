package lab3c;

public class p17 {

    public static String truncate(String str, int length) {
        if (str.length() <= length)
            return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String str = "Hello World Programming";
        System.out.println(truncate(str, 10));
    }
}
