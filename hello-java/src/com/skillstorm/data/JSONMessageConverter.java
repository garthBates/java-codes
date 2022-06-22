package com.skillstorm.data;

public class JSONMessageConverter implements MessageConverter {

	@Override
	public Student convert(String string) {
		// logic for parsing JSON string
		return new Student();
	}

}
