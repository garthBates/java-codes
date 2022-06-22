package factory;

// Design Patterns
// Factory - centralize object creation
// Decouples component 
// Loose coupling - objects aren't highly dependent
public class BeanFactory {

	// create a bean
	public static Bean createBean(String type) {
		switch(type) {
			case "java": return new JavaBean();
			case "coffee": return new CoffeeBean();
			default: return new JavaBean();
		}
			
	}
	
}
