package demo;

/**
 * ONLY 1 instance of this bean.. ever
 * 
 * Stateless - doesn't store any application state, usually does processing
 * 
 */
public class Singleton {
	
	public final static Singleton INSTANCE;
	

	// Eagerly loaded singleton - load when the Classloader starts (pre-main)
	static { // static initializer / block
		INSTANCE = new Singleton();
	}

	// no one can call the constructor directly
	private Singleton() {
		
	}
	
	
	// Lazy loaded singleton
	
	
	
}
