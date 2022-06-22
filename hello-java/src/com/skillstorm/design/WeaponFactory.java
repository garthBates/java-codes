package com.skillstorm.design;

// Factory design pattern: 
// 		decouples classes by providing concrete implementations 
public class WeaponFactory {

	public static Weapon createSpaceSword() {
		return new Lightsaber();
	}
	
}
