/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.MarketHasStock;

/**
 * MarketHasStock 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:16:01
 */
public interface IMarketHasStockService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入MarketHasStock信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:16:45
	 * @param marketHasStock
	 */
	public void save(MarketHasStock marketHasStock);
}
