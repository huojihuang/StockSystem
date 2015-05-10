/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IStockService;
import com.B6.StockSystem.dao.IStockDao;
import com.B6.StockSystem.entities.Stock;

/**
 * @author Nike
 *@version2015年5月10日 下午3:36:49
 */

@Transactional(readOnly = false)
@Scope("prototype")
@Service("stockServiceImpl")
public class StockServiceImpl implements IStockService{

	@Resource
	IStockDao stockServiceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IStockService#save(com.B6.StockSystem.entities.Stock)
	 */
	@Override
	public void save(Stock stock) {

		this.stockServiceImpl.save(stock);
	}

}
