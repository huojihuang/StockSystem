/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.StockHas;

/**
 * StockHas 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:29:01
 */
public interface IStockHasService {

    /**
     * 通过调用数据访问层的save方法，向数据库中存入stockHas信息
     *@authorNike
     *@Version2015年5月7日 下午11:29:37
     * @param stockHas
     */
	public void save(StockHas stockHas);
}
