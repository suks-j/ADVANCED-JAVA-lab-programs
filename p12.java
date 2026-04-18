package lab3b;

public class p12 {

    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "hello hello hello";
        String sub = "hello";
        System.out.println(countOccurrences(main, sub));
    }
}
