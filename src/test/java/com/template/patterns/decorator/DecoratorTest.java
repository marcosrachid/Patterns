package com.template.patterns.decorator;

import org.junit.Test;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/decorator/java/3">Decorator
 *      reference</a>
 *
 */
public class DecoratorTest {

	@Test
	public void test() {
		Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
		widget.draw();
	}

}
