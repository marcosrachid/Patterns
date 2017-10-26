package com.template.patterns.singleton;

/**
 * 
 * @author marcosrachid
 *
 */
public class Singleton {

	private static Singleton singleton = null;

	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public void methods() {

	}

}
