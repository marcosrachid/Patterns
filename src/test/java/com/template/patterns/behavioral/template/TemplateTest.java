package com.template.patterns.behavioral.template;

import org.junit.Test;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1763/template-method-design-pattern-in-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Template
 *      reference</a>
 *
 */
public class TemplateTest {

	@Test
	public void test() {
		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
