package com.template.patterns.structural.decorator;

/**
 * 
 * @see <a href=
 *      "https://sourcemaking.com/design_patterns/decorator/java/3">Decorator
 *      reference</a>
 *
 */
public abstract class Decorator implements Widget {

	private Widget widget;

	public Decorator(Widget widget) {
		this.widget = widget;
	}

	@Override
	public void draw() {
		widget.draw();
	}

}
