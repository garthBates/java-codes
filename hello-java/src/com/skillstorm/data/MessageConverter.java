package com.skillstorm.data;

public interface MessageConverter {

	// CSV, JSON, XML, ...
	public Student convert(String string);
	
}
