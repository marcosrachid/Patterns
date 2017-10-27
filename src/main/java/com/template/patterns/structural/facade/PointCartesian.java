package com.template.patterns.structural.facade;

/**
 * 
 * @see <a href="https://sourcemaking.com/design_patterns/facade/java/1">Facade
 *      reference</a>
 *
 */
public class PointCartesian {

	private double x, y;
	
    public PointCartesian(double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public void  move( int x, int y ) {
        this.x += x;
        this.y += y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
}
