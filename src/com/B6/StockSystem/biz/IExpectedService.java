/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Expected;

/**
 * Expected 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午10:56:56
 */
public interface IExpectedService {
   
	/**
	 * 通过调用数据访问层的save方法，向数据库中存入Expected信息
	 *@authorNike
	 *@Version2015年5月7日 下午10:58:03
	 * @param expected
	 */
	public void save(Expected  expected);
}
