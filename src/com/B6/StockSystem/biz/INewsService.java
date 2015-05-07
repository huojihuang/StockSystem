/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.News;

/**
 * News 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:20:15
 */
public interface INewsService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入News信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:20:52
	 * @param news
	 */
	public void save(News news);
}
