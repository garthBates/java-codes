package demo;

/**
 * ONLY 1 instance of this bean.. ever
 * 
 * Stateless - doesn't store any application state, usually does processing
 * 
 */
public class Singleton {

	private static Singleton INSTANCE;
	private static Object lock = new Object();

	// Eagerly loaded singleton - load when the Classloader starts (pre-main)
	// static initializer / block
	/*
	 * static { INSTANCE = new Singleton(); }
	 */
	// Ctrl+Shift+/ comment // Ctrl+Shift+\ uncomment

	// no one can call the constructor directly
	private Singleton() {

	}

	// Lazy loaded singleton (flawed)
	public static Singleton getInstance() {
		
		
		synchronized (lock) {
			if(INSTANCE == null) {
				INSTANCE = new Singleton();
			}
		}
		
		
		
		return INSTANCE;
	}
	
}





