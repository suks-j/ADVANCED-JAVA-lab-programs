package lab1b;
import java.util.*;

public class p5 {
		    public static void main(String[] args) {

		        // Creating ArrayList
		        ArrayList<String> colors = new ArrayList<>();

		        // Adding colors
		        colors.add("Red");
		        colors.add("Blue");
		        colors.add("Green");
		        colors.add("Yellow");
		        colors.add("White");

		        // Display original list
		        System.out.println("Original List: " + colors);

		        // Define n (example: 3rd element)
		        int n = 3;

		        // Removing nth element (index = n-1)
		        if (n > 0 && n <= colors.size()) {
		            colors.remove(n - 1);
		            System.out.println("After removing " + n + "th element: " + colors);
		        } else {
		            System.out.println("Invalid position!");
		        }
		    }
		}

