/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Stock;

/**
 * Stock 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:24:09
 */
public interface IStockService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入stock信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:24:44
	 * @param stock
	 */
	public void save(Stock stock);
}
