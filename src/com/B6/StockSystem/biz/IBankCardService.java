package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Bankcard;

/**
 * BankCard 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:34:04
 */
public interface IBankCardService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入bankCard信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:34:27
	 * @param bankCard
	 */
	public void save(Bankcard bankCard);
}
