package com.template.patterns.command;

/**
 * 
 * @see <a href="http://www.oodesign.com/command-pattern.html">Command
 *      reference</a>
 *
 */
public class SellStockOrder implements Order {

	private StockTrade stock;

	public SellStockOrder(StockTrade st) {
		stock = st;
	}

	public void execute() {
		stock.sell();
	}
}
