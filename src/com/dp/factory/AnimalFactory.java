package com.dp.factory;

public class AnimalFactory {
	
	public Animal getType(String a) {
		if (a.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (a.equals("cat")) {
			return new Cat();
		}
		return null;
	}
}
