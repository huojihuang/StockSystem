/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IBbsBlogService;
import com.B6.StockSystem.dao.IBbsBlogDao;
import com.B6.StockSystem.entities.Bbsblog;

/**
 * @author Nike
 *@version2015年5月10日 下午3:03:32
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("bbsBlogServiceImpl")
public class BbsBlogServiceImpl implements IBbsBlogService{

	  @Resource
	 IBbsBlogDao bbsBlogServiceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IBbsBlogService#save(com.B6.StockSystem.entities.Bbsblog)
	 */
	@Override
	public void save(Bbsblog bbsBlog) {
		this.bbsBlogServiceImpl.save(bbsBlog);
		
	}


}
