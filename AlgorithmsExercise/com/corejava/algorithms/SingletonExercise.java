package com.corejava.algorithms;

public class SingletonExercise {

	public static void main(String[] args) {
		
		SingletonClass singletonClass = SingletonClass.createInstance();
		System.out.println(singletonClass);
		
		SingletonClass singletonClass1 = SingletonClass.createInstance();
		System.out.println(singletonClass1);
		
		System.out.println(singletonClass.member1 + singletonClass.member2);
		System.out.println(singletonClass1.member1 + singletonClass1.member2);

	}

}
