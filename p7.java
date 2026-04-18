package lab1c;
import java.util.*;

public class p7 {

	    public static void main(String[] args) {
	        LinkedList<String> objlist = new LinkedList<>();

	        objlist.add("Red");
	        objlist.add("Blue");
	        objlist.add("Green");
	        objlist.add("Yellow");

	        Iterator<String> it = objlist.descendingIterator();

	        System.out.println("Reverse order:");
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}
