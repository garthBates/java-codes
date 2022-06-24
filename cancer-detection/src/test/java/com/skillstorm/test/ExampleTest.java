package com.skillstorm.test;

import com.skillstorm.code.ApplicationComponent;

// junit.framework - most times they work. sometimes... not so much
// org.junit - work as expected
import org.junit.Assert; // deprecated (isn't supported anymore)
import org.junit.BeforeClass;
import org.junit.Test;

// src/test/java
// JavaCoCo (Java Code Coverage)
//in src/test/java *Test.java get run by Maven
public class ExampleTest { 
	
	static ApplicationComponent component; 
	
	// before all my tests - run this setup method
	@BeforeClass // @BeforeAll
	public static void setupBeforeAll() {
		 component = new ApplicationComponent();
	}

	@Test // tells JUnit that this is a test method (Test case)
	public void testOver18() {
		
		boolean actual = component.checkId(25); // actual
		// expect to get true
		boolean expected = true;

		// Assert methods - if(expected == actual) else throw new AssertionException
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testUnder18() {
		Assert.assertEquals(false, component.checkId(12));
	}

}
