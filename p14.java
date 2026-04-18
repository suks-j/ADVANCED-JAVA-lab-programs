package lab3b;
public class p14 {

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        String str = "Madam, I'm Adam";
        System.out.println(isPalindrome(str));
    }
}
