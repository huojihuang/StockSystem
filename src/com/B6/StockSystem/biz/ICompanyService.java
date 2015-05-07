/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Company;

/**
 * Company 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:04:56
 */
public interface ICompanyService {
   
	/**
	 * 通过调用数据访问层的save方法，向数据库中存入Company信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:05:41
	 * @param company
	 */
	public void save(Company company);
}
