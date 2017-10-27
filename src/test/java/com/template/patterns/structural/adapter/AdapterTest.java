package com.template.patterns.structural.adapter;

import org.junit.Test;

import com.template.patterns.structural.adapter.Line;
import com.template.patterns.structural.adapter.LineAdapter;
import com.template.patterns.structural.adapter.Rectangle;
import com.template.patterns.structural.adapter.RectangleAdapter;
import com.template.patterns.structural.adapter.Shape;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/adapter/java/1">Adapter
 *      reference</a>
 *
 */
public class AdapterTest {

	@Test
	public void test() {
		Shape[] shapes = { new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()) };
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}

}
