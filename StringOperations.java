package lab3a;

public class StringOperations {

	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String s1 = "Hello";
	        String s2 = new String("World");
	        System.out.println("String s1: " + s1);
	        System.out.println("String s2: " + s2);

	        // 2. Length and Character Access
	        System.out.println("Length of s1: " + s1.length());
	        System.out.println("Character at index 2: " + s1.charAt(2));

	        // 3. String Comparison
	        String a = "Java";
	        String b = "java";
	        System.out.println("Equals: " + a.equals(b));
	        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
	        System.out.println("CompareTo: " + a.compareTo(b));

	        // 4. String Searching
	        String text = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + text.indexOf("Java"));
	        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));
	        System.out.println("Contains 'Welcome': " + text.contains("Welcome"));

	        // 5. Substring Operations
	        String str = "Programming";
	        System.out.println("Substring(0,6): " + str.substring(0, 6));
	        System.out.println("Substring(3): " + str.substring(3));

	        // 6. String Modification
	        String mod = "Java Programming";
	        System.out.println("Uppercase: " + mod.toUpperCase());
	        System.out.println("Lowercase: " + mod.toLowerCase());
	        System.out.println("Replace: " + mod.replace("Java", "Python"));

	        // 7. Whitespace Handling
	        String ws = "   Hello Java   ";
	        System.out.println("Before trim: '" + ws + "'");
	        System.out.println("After trim: '" + ws.trim() + "'");

	        // 8. String Concatenation
	        String concat1 = s1 + " " + s2;
	        String concat2 = s1.concat(s2);
	        System.out.println("Using + : " + concat1);
	        System.out.println("Using concat(): " + concat2);

	        // 9. String Splitting
	        String data = "C,Java,Python,C++";
	        String[] arr = data.split(",");
	        System.out.println("Split Result:");
	        for (String x : arr) {
	            System.out.println(x);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        sb.replace(0, 5, "Hi");
	        sb.delete(2, 7);
	        System.out.println("StringBuilder Output: " + sb);

	        // 11. String Formatting
	        String name = "John";
	        int age = 21;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Email Validation using contains(), startsWith(), endsWith()
	        String email = "student@gmail.com";

	        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}