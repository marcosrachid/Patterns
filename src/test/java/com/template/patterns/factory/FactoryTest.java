package com.template.patterns.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		assertTrue(pc instanceof PC);
		assertTrue(server instanceof Server);
	}

}
