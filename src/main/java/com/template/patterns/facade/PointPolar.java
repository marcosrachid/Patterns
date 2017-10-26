package com.template.patterns.facade;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/facade/java/1">Facade
 *      reference</a>
 *
 */
public class PointPolar {

	private double radius, angle;

	public PointPolar(double radius, double angle) {
		this.radius = radius;
		this.angle = angle;
	}

	public void rotate(int angle) {
		this.angle += angle % 360;
	}

	public String toString() {
		return "[" + radius + "@" + angle + "]";
	}

}
