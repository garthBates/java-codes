package scopes;

public class VariableScopes {
	// longest living
	static int classScope = 1;  // shared by all instances of this object
	int instanceScope = 2;  // only that object
	
	public static void main(String[] args) {
		VariableScopes obj = new VariableScopes();
		obj.instanceScope = 100;
		
		VariableScopes obj2 = new VariableScopes();
		obj2.instanceScope = 200;
		
		obj = null; // obj eligible for GC
		
		// gently request GC "suggest"
		System.gc();
		Runtime.getRuntime().gc();
		
	} // local variables are eligible for GC
	
	
}
