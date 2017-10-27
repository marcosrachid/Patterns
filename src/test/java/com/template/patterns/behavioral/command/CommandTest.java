package com.template.patterns.behavioral.command;

import org.junit.Test;

import com.template.patterns.behavioral.command.Agent;
import com.template.patterns.behavioral.command.BuyStockOrder;
import com.template.patterns.behavioral.command.SellStockOrder;
import com.template.patterns.behavioral.command.StockTrade;

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
