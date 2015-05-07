/**
 * 
 */
package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Reply;

/**
 * Reply的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:22:17
 */
public interface IReplyService {
  
	/**
	 * 通过调用数据访问层的save方法，向数据库中存入reply信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:23:20
	 * @param reply
	 */
	public void save(Reply reply);
}
