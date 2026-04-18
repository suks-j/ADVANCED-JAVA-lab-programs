package lab1c;
import java.util.*;

public class p10 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");

        System.out.println("Before swap: " + l_list);

        Collections.swap(l_list, 0, 2);

        System.out.println("After swap: " + l_list);
    }
}