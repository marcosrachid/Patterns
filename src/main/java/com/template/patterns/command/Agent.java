package com.template.patterns.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @see <a href="http://www.oodesign.com/command-pattern.html">Command
 *      reference</a>
 *
 */
public class Agent {
	
	private Queue<Order> ordersQueue = new LinkedList<>();

    public Agent() {
    }
    
    void placeOrder(Order order) {
        ordersQueue.add(order);
        order.execute();
    }    
}
