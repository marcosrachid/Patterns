package com.template.patterns.behavioral.iterator;

/**
 * 
 * @see <a href=
 *      "https://www.journaldev.com/1716/iterator-design-pattern-java?utm_source=website&utm_medium=sidebar&utm_campaign=DesignPattern-Sidebar-Widget">Iterator
 *      reference</a>
 *
 */
public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;

	public Channel(double freq, ChannelTypeEnum type) {
		this.frequency = freq;
		this.TYPE = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
	}

}
