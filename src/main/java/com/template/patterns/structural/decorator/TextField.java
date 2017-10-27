package com.template.patterns.structural.decorator;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/decorator/java/3">Decorator
 *      reference</a>
 *
 */
public class TextField implements Widget {

	private int width, height;

	public TextField(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("TextField: " + width + ", " + height);
	}

}
