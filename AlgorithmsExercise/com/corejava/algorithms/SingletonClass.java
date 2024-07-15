package com.corejava.algorithms;

public final class SingletonClass {

	private static SingletonClass singletonClass;
	//private static int member1;
	//private static String member2;
	public int member1;
	public String member2;
	
	private SingletonClass() {
		member1 = 10;
		member2 = "ABC";
	}
	
	public static SingletonClass createInstance() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}

}
