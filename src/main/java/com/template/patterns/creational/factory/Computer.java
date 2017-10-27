package com.template.patterns.creational.factory;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1392/factory-design-pattern-in-java">Factory
 *      pattern</a>
 *
 */
public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
	}

}
