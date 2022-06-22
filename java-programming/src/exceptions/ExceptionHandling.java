package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		// ArthimeticException extends RuntimeException (unchecked -- just code better)
		// do not NEED catch block
		//int i = 5 / 0;
		//String str = null;
		//str.toString();
		try {
			// risky business
			skydive();
			System.out.println("finished try");
		} // subclass
		// multi-catch (multiple catch blocks)
		catch(ChuteDidNotDeployException | PulledWrongChuteException e) {
			// recovery procedures
			System.out.println("pull secondary chute");
		} 
		// superclass
		catch(Throwable t ) {
			
		}
		finally { // "always" executes 
			// if exception is thrown
			// not thrown
			// Network connections, filestreams, "resources" close
			System.out.println("finally");
		}
	}
	
	
	

	// StackOverflowError   OutOfMemoryError (error shouldn't be recovered)
	// SQLException ConnectionException FileNotFoundException
	static void skydive() throws ChuteDidNotDeployException, PulledWrongChuteException { // method declaration - this method MIGHT throw an Exception
		if(Math.random() > 0.5) {
			System.out.println("Deployed");
		}else {
			// checked exception
			throw new ChuteDidNotDeployException();  // create a Exception object  HALT EXECUTION
		}
	}
}
// checked exception - domain-specific exception
class ChuteDidNotDeployException extends Exception {}
class PulledWrongChuteException extends Exception{}



