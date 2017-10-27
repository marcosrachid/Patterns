package com.template.patterns.structural.composite;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/composite/java/2">Composite reference</a>
 *
 */
public abstract class Entity {

	protected static StringBuffer indent = new StringBuffer();
	protected static int level = 1;

	public abstract void traverse(int[] levels);

	protected boolean printThisLevel(int[] levels) {
		for (int value : levels) {
			if (level == value) {
				return true;
			}
		}
		return false;
	}

}
