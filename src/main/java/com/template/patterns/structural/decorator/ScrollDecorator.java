package com.template.patterns.structural.decorator;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/decorator/java/3">Decorator
 *      reference</a>
 *
 */
public class ScrollDecorator extends Decorator {

	public ScrollDecorator(Widget widget) {
		super(widget);
	}

	@Override
	public void draw() {
		super.draw(); // 7. Delegate to base class and add extra stuff
		System.out.println("  ScrollDecorator");
	}

}
