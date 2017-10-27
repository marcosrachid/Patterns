package com.template.patterns.structural.adapter;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/adapter/java/1">Adapter
 *      reference</a>
 *
 */
public class Rectangle {
	public void draw(int x, int y, int width, int height) {
		System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
				+ ", height: " + height);
	}
}
