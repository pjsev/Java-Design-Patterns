package com.dp.singleton;

public class SingletonDemo {
	
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		
		System.out.println(x.s);
	}
}
