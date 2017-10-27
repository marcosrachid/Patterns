package com.template.patterns.creational.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import com.template.patterns.creational.builder.Pojo;
import com.template.patterns.creational.builder.PojoBuilder;

public class BuilderTest {

	@Test
	public void test() {
		Pojo pojo = new PojoBuilder()
				.withA("a")
				.withB("b")
				.withC("c")
				.withD(10)
				.withE(2213123L)
				.build();
		assertTrue(pojo instanceof Pojo);
	}

}
