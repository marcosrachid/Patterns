package com.template.patterns.behavioral.observer;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1739/observer-design-pattern-in-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Observer
 *      reference</a>
 *
 */
public interface Observer {

	// method to update the observer, used by subject
	public void update();

	// attach with subject to observe
	public void setSubject(Subject sub);

}
