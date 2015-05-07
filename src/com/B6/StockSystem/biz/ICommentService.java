package com.B6.StockSystem.biz;

import com.B6.StockSystem.entities.Comment;

/**
 * Comment 的业务逻辑层
 * @author Nike
 *@version2015年5月7日 下午11:35:37
 */
public interface ICommentService {

	/**
	 * 通过调用数据访问层的save方法，向数据库中存入comment信息
	 *@authorNike
	 *@Version2015年5月7日 下午11:35:56
	 * @param comment
	 */
	public void save(Comment comment);
}
