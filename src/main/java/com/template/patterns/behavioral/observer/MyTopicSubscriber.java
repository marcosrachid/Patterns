package com.template.patterns.behavioral.observer;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1739/observer-design-pattern-in-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Observer
 *      reference</a>
 *
 */
public class MyTopicSubscriber implements Observer {

	private String name;
	private Subject topic;

	public MyTopicSubscriber(String nm) {
		this.name = nm;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

}
