package com.template.patterns.structural.decorator;

import org.junit.Test;

import com.template.patterns.structural.decorator.BorderDecorator;
import com.template.patterns.structural.decorator.ScrollDecorator;
import com.template.patterns.structural.decorator.TextField;
import com.template.patterns.structural.decorator.Widget;

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
