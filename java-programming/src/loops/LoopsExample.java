package loops;

// import java.lang.Math;
import java.util.Random;

public class LoopsExample {

	public static void main(String[] args) {	
		int[] a = {5,80,2,35}; // array initializer
		
		int[] array = new int[5];  // empty array (fixed size)
		array[0] = 100;
		array[1] = 101;
		Fish[] bucket = new Fish[5];
		
		// for each loop - Iterable  -- can be iterated
		for(int x : a) {
			System.out.println(x);
		}
		// forseeable end to the loop (finite)
		
		// loop until doCheck returns false (sentinel controlled loop) - flag controlled
		while(doCheck()) {
			System.out.println("while...");
		}
		
		do {
			// run this code first
			System.out.println("do while");
		}while(doCheck());
		
		
		maths();
	}
	
	// Math
	static void maths() {
		System.out.println(Math.random());
		 // java.lang
		if(Math.random() > 0.5) {
			// 50/50
		}
	}
	
	static boolean doCheck() {
		// java.util
		Random random = new Random();
		// - 2b ===> +2b

		// ternary operator
		return random.nextInt() > 0? true : false;
	}
	
}

class Fish{}