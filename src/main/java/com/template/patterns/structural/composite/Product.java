package com.template.patterns.structural.composite;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/composite/java/2">Composite reference</a>
 *
 */
public class Product extends Entity {
	
	private int value;
	
    public Product(int value) {
        this.value = value;
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
    
}
