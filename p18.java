package lab3c;
public class p18 {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println(isNumeric(str));
    }
}
