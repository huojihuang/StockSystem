/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.ICommentService;
import com.B6.StockSystem.dao.ICommentDao;
import com.B6.StockSystem.entities.Comment;

/**
 * @author Nike
 *@version2015年5月10日 下午3:08:18
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("CommentServiceImpl")
public class CommentServiceImpl implements ICommentService{
    
	@Resource
	ICommentDao commentServiceImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.ICommentService#save(com.B6.StockSystem.entities.Comment)
	 */
	@Override
	public void save(Comment comment) {

		this.commentServiceImpl.save(comment);
	}

}
