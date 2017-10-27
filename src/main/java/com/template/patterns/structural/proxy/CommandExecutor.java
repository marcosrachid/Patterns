package com.template.patterns.structural.proxy;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1572/proxy-design-pattern?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Proxy
 *      reference</a>
 *
 */
public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;

}
