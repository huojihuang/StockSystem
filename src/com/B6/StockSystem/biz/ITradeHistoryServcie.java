/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.TradeHistory;

/**
 * TradeHistory 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:31:19
 */
public interface ITradeHistoryServcie {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入tradeHistory信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:32:12
	 * @param tradeHistory
	 */
	public void save(TradeHistory tradeHistory);
}
