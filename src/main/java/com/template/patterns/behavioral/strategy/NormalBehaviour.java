package com.template.patterns.behavioral.strategy;

/**
 * 
 * @see <a href="http://www.oodesign.com/strategy-pattern.html">Strategy
 *      reference</a>
 *
 */
public class NormalBehaviour implements IBehaviour {

	public int moveCommand() {
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}

}
