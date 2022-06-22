package casting;

public class CastingExample {

	public static void main(String[] args) {
		new Dog("index");
	}
	
}
// new Dog()   -- new Animal()   -- new Object() 
class Animal extends java.lang.Object{
	
	private double mass;

	String name;
	
	public Animal( ) {
		System.out.println("super");
	}
	public Animal(int i) {
		super(); //this();
	}
	
	public void speak() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {

	// default initialization
	public Dog() {
		super();
		System.out.println("this");
	}
	
	public Dog(String name) {
		this(); // DRY
		this.name = name;
		System.out.println("Dog " + name);
	}

	public void speak() {
		System.out.println("Dog");
	}
}

