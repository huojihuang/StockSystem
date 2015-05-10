/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IReplyService;
import com.B6.StockSystem.dao.IReplyDao;
import com.B6.StockSystem.entities.Reply;

/**
 * @author Nike
 *@version2015年5月10日 下午3:22:50
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("replyServiceImpl")
public class ReplyServiceImpl implements IReplyService{
    
	@Resource
	IReplyDao replyServiceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IReplyService#save(com.B6.StockSystem.entities.Reply)
	 */
	@Override
	public void save(Reply reply) {
         this.replyServiceImpl.save(reply);
		
	}

}
