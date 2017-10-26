package com.template.patterns.singleton;

/**
 * The singleton pattern is one of the simplest design patterns: it involves
 * only one class which is responsible to instantiate itself, to make sure it
 * creates not more than one instance; in the same time it provides a global
 * point of access to that instance. In this case the same instance can be used
 * from everywhere, being impossible to invoke directly the constructor each
 * time.
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
