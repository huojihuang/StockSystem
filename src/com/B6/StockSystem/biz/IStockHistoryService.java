/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.StockHistory;

/**
 * StockHistory 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:30:56
 */
public interface IStockHistoryService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入stockHistory信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:33:29
	 * @param stockHistory
	 */
	public void save(StockHistory stockHistory);
}
