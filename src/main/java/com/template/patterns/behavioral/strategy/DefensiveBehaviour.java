package com.template.patterns.behavioral.strategy;

/**
 * 
 * @see <a href="http://www.oodesign.com/strategy-pattern.html">Strategy
 *      reference</a>
 *
 */
public class DefensiveBehaviour implements IBehaviour {

	public int moveCommand() {
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return -1;
	}

}
