/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.StockFocus;

/**
 * StockFocus的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:25:58
 */
public interface IStockFocusService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入stockFocus信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:27:48
	 * @param stockFocus
	 */
	public void save(StockFocus stockFocus);
}
