package com.template.patterns.behavioral.template;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1763/template-method-design-pattern-in-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Template
 *      reference</a>
 *
 */
public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

}
