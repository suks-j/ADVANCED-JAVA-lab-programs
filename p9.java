package lab1c;
import java.util.*;

public class p9 {
    public static void main(String[] args) {
        LinkedList<String> l_listobj = new LinkedList<>();

        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        System.out.println("Elements with positions:");
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + " : " + l_listobj.get(p));
        }
    }
}
