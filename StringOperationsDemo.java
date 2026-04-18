package lab2;

public class StringOperationsDemo {
	    public static void main(String[] args) {

	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String s1 = "Java";
	        String s2 = "java";
	        System.out.println("Equals: " + s1.equals(s2));
	        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
	        System.out.println("CompareTo: " + s1.compareTo(s2));

	        // 4. String Searching
	        String searchStr = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + searchStr.indexOf("Java"));
	        System.out.println("Last Index of 'o': " + searchStr.lastIndexOf('o'));
	        System.out.println("Contains 'Welcome': " + searchStr.contains("Welcome"));

	        // 5. Substring Operations
	        String subStr = "Programming";
	        System.out.println("Substring (0-6): " + subStr.substring(0, 6));
	        System.out.println("Substring (3): " + subStr.substring(3));

	        // 6. String Modification
	        String modStr = "Java Programming";
	        System.out.println("Uppercase: " + modStr.toUpperCase());
	        System.out.println("Lowercase: " + modStr.toLowerCase());
	        System.out.println("Replace: " + modStr.replace("Java", "Python"));

	        // 7. Whitespace Handling
	        String ws = "   Hello Java   ";
	        System.out.println("Trimmed: '" + ws.trim() + "'");

	        // 8. String Concatenation
	        String concat = str1 + " " + str2;
	        System.out.println("Concatenated String: " + concat);
	        System.out.println("Using concat(): " + str1.concat(str2));

	        // 9. String Splitting
	        String sentence = "Java,Python,C,C++";
	        String[] languages = sentence.split(",");
	        System.out.println("Split Strings:");
	        for (String lang : languages) {
	            System.out.println(lang);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        sb.replace(0, 5, "Hi");
	        sb.delete(2, 7);
	        System.out.println("StringBuilder Result: " + sb);

	        // 11. String Formatting
	        String name = "John";
	        int age = 22;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";
	        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
	            System.out.println("Valid Email");
	        } else {
	            System.out.println("Invalid Email");
	        }
	    }
	}
