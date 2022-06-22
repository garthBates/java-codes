import java.io.Serializable;

// only 1 public class per file. name of file === classname
// generalization
public abstract class Animal { // parent (super class)
	int lifespan;

	public abstract void speak();
	
	public void hello() {
		System.out.println("hello");
	}
	
}

// concrete - not abstract
// specialization
// DRY - don't repeat yourself (good)
// WET - write everything twice 
class Dog extends Animal implements Hunter, Serializable, Cloneable { // child (sub class)
	public void birth(int lifespan) {
		this.lifespan = lifespan;

		this.speak();
		speak(); // static
	}

	// overriding
	public void speak() {
		System.out.println("Bark");
	}

	public void speak(String str) {
	} // overloading

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}
}