package com.template.patterns.structural.facade;

import org.junit.Test;

import com.template.patterns.structural.facade.Line;
import com.template.patterns.structural.facade.Point;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/facade/java/1">Facade
 *      reference</a>
 *
 */
public class FacadeTest {

	@Test
	public void test() {
		Line lineA = new Line(new Point(2, 4), new Point(5, 7));
		lineA.move(-2, -4);
		System.out.println("after move:  " + lineA);
		lineA.rotate(45);
		System.out.println("after rotate: " + lineA);
		Line lineB = new Line(new Point(2, 1), new Point(2.866, 1.5));
		lineB.rotate(30);
		System.out.println("30 degrees to 60 degrees: " + lineB);
	}

}
