package com.template.patterns.decorator;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/decorator/java/3">Decorator
 *      reference</a>
 *
 */
public class BorderDecorator extends Decorator {

	public BorderDecorator(Widget widget) {
		super(widget);
	}

	@Override
	public void draw() {
		// 7. Delegate to base class and add extra stuff
		super.draw();
		System.out.println("  BorderDecorator");
	}

}
