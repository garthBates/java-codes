package generics;

import java.util.ArrayList;

public class GenericsExample {
	
	public static void main(String[] args) {
		int primitive = 10;
		// wrapping - boxing
		Integer wrapper = new Integer(100);
		// unwrapping - unboxing
		primitive = wrapper.intValue();
		
		// auto-boxing
		Integer x = 10;
		int prim = x;
	}

}
