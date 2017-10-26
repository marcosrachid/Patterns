package com.template.patterns.adapter;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/adapter/java/1">Adapter
 *      reference</a>
 *
 */
public class LineAdapter implements Shape {
	private Line adaptee;

	public LineAdapter(Line line) {
		this.adaptee = line;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adaptee.draw(x1, y1, x2, y2);
	}

}
