/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.INewsService;
import com.B6.StockSystem.dao.INewsDao;
import com.B6.StockSystem.entities.News;

/**
 * @author Nike
 *@version2015年5月10日 下午3:21:02
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("newsServiceImpl")
public class NewsServiceImpl implements INewsService{

	@Resource
	INewsDao newsServiceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.INewsService#save(com.B6.StockSystem.entities.News)
	 */
	@Override
	public void save(News news) {

		this.newsServiceImpl.save(news);
	}

}
