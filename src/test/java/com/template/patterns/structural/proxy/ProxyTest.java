package com.template.patterns.structural.proxy;

import org.junit.Test;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1572/proxy-design-pattern?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Proxy
 *      reference</a>
 *
 */
public class ProxyTest {

	@Test(expected = Exception.class)
	public void test() throws Exception {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		executor.runCommand("ls -ltr");
		executor.runCommand(" rm -rf abc.pdf");
	}

}
