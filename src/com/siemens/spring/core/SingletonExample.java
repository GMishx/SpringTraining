package com.siemens.spring.core;

public class SingletonExample {
	private static SingletonExample self = null;

	private SingletonExample() {
	}

	public static synchronized SingletonExample getSingletonExample() {
		if (self == null) {
			self = new SingletonExample();
		}
		return self;
	}
}
