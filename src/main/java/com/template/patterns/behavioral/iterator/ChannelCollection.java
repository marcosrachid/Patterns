package com.template.patterns.behavioral.iterator;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1716/iterator-design-pattern-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Iterator
 *      reference</a>
 *
 */
public interface ChannelCollection {

	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public ChannelIterator iterator(ChannelTypeEnum type);

}