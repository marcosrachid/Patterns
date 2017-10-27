package com.template.patterns.behavioral.template;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1763/template-method-design-pattern-in-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Template
 *      reference</a>
 *
 */
public abstract class HouseTemplate {

	// template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	// default implementation
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void buildWalls();

	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

}
