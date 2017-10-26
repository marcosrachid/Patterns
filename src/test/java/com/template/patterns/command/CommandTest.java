package com.template.patterns.command;

import org.junit.Test;

/**
 * 
 * @see <a href="http://www.oodesign.com/command-pattern.html">Command
 *      reference</a>
 *
 */
public class CommandTest {

	@Test
	public void test() {
		StockTrade stock = new StockTrade();
		BuyStockOrder bsc = new BuyStockOrder(stock);
		SellStockOrder ssc = new SellStockOrder(stock);
		Agent agent = new Agent();

		agent.placeOrder(bsc);
		agent.placeOrder(ssc);
	}

}
