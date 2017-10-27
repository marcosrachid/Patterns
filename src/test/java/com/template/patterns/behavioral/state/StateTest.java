package com.template.patterns.behavioral.state;

import org.junit.Test;

/**
 * 
 * @author marcosrachid
 *
 */
public class StateTest {

	@Test
	public void test() {
		MachineContext machine = new MachineContext();
		machine.action();
		machine.action();
		machine.action();
	}

}
