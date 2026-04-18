package lab1c;
import java.util.*;
	public class p8 {
	    public static void main(String[] args) {
	        LinkedList<String> l_listobj = new LinkedList<>();

	        l_listobj.add("Red");
	        l_listobj.add("Blue");

	        l_listobj.offerLast("Pink");

	        System.out.println("After inserting Pink:");
	        System.out.println(l_listobj);
	    }
	}

