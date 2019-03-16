package com.dp.singleton;

public class Singleton {
	
	private static Singleton singleton = null;
	public String s;
	
	private Singleton() {
		s = "This is a singleton class";
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
