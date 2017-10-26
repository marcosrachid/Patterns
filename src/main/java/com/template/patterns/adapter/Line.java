package com.template.patterns.adapter;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/adapter/java/1">Adapter
 *      reference</a>
 *
 */
public class Line {
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
	}
}
