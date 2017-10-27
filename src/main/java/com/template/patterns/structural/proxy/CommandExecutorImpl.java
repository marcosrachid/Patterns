package com.template.patterns.structural.proxy;

import java.io.IOException;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1572/proxy-design-pattern?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Proxy
 *      reference</a>
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}
