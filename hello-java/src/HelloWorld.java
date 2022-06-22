// SOLID - 

// Single responsibility principle - cohesive (cohesion)
public class HelloWorld {

	// main method - first method JVM calls (entry-point)
	
	public static void main(String... args) {
		// reference variable = constructor
		Dog one = new Dog();
		one.hunt();
		Hunter hunter = new Dog();
	}
	
	// polymorphism
	// Dog, Cat, Wolf
	public void startHunt(Hunter hunter) {
		
	}
	
}
