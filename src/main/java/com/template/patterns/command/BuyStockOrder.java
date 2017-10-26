package com.template.patterns.command;

/**
 * 
 * @see <a href="http://www.oodesign.com/command-pattern.html">Command
 *      reference</a>
 *
 */
public class BuyStockOrder implements Order {

	private StockTrade stock;

	public BuyStockOrder(StockTrade st) {
		stock = st;
	}

	public void execute() {
		stock.buy();
	}
}
