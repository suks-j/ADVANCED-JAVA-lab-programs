package lab1b;
import java.util.*;
public class p3 {
		    public static void main(String[] args) {

		        // Creating ArrayList
		        ArrayList<String> colors = new ArrayList<>();

		        // Adding colors
		        colors.add("Blue");
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Yellow");
		        colors.add("White");

		        // Display original list
		        System.out.println("Before Sorting: " + colors);

		        // Sorting the ArrayList
		        Collections.sort(colors);

		        // Display sorted list
		        System.out.println("After Sorting: " + colors);
		    }
		}

