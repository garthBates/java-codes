package collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// Classpath - where all your resources/code exists
public class PropertiesExample {

	static {
		// @ class load time
		System.out.println("Class loading");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		// props.load(new FileReader("application.properties"));
		// loading props from the Classpath
		InputStream in = ClassLoader.getSystemResourceAsStream("application.properties");
		props.load(in);
		System.out.println(props.get("database.username"));
	}

}
