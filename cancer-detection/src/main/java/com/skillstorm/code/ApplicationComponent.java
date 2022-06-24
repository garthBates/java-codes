package com.skillstorm.code;

//@Deprecated
public class ApplicationComponent {

	public boolean checkId(int age) {
		if(age < 18) { // path
			return false;
		}else { // another path (code coverage)
			return true;
		}
	}
	
}
