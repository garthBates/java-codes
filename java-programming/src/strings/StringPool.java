package strings;

public class StringPool {

	public static void main(String[] args) {
		// string assignment - uses the String pool
		String str = "Hello";
		String str2 = new String("Hello"); // bypasses the String pool
		
		// equals - comparing memory locations
		System.out.println(str == str2); // primitives
		System.out.println(str.equals(str2)); // equivalent in value
		
		// ['H', 'e','l','l','o']
		
	}
	
}
