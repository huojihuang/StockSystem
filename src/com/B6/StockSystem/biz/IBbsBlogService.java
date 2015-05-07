package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Bbsblog;

/**
 * BbsBlog 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:34:49
 */
public interface IBbsBlogService {
    
	/**
	 * 通过调用数据访问层的save方法，向数据库中存入bbsBlog信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:35:20
	 * @param bbsBlog
	 */
	public void save(Bbsblog bbsBlog);
}
