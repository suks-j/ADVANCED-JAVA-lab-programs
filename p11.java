package lab3b;
public class p11 {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String str = "   ";
        System.out.println(isNullOrEmpty(str));
    }
}
