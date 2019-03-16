package com.dp.factory;

public class AnimalDemo {
	
	public static void main(String[] args) {
		AnimalFactory af = new AnimalFactory();
		Animal a = af.getType("dog");
		a.makeSound();
		
		Animal b = af.getType("cat");
		b.makeSound();
	}
}
