package com.template.patterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.template.patterns.creational.singleton.Singleton;

/**
 * 
 * @author marcos
 *
 */
public class SingletonTest {

	@Test
	public void test() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		assertTrue(singleton1.equals(singleton2));
	}
}
