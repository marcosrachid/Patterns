package com.template.patterns.structural.facade;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/facade/java/1">Facade
 *      reference</a>
 *
 */
public class Line {

	private Point o, e;

	public Line(Point ori, Point end) {
		o = ori;
		e = end;
	}

	public void move(int x, int y) {
		o.move(x, y);
		e.move(x, y);
	}

	public void rotate(int angle) {
		e.rotate(angle, o);
	}

	public String toString() {
		return "origin is " + o + ", end is " + e;
	}

}
