/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Market;

/**
 * 
 * Market 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:09:55
 */
public interface IMarketService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入Market信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:11:42
	 * @param market
	 */
	 public void save(Market market);
}
