/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IStockFocusService;
import com.B6.StockSystem.dao.IStockFocusDao;
import com.B6.StockSystem.entities.StockFocus;

/**
 * @author Nike
 *@version2015年5月10日 下午3:24:40
 */

@Transactional(readOnly = false)
@Scope("prototype")
@Service("stockFocusServiceImpl")
public class StockFocusServiceImpl implements IStockFocusService{

	IStockFocusDao stockFocusServiceImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IStockFocusService#save(com.B6.StockSystem.entities.StockFocus)
	 */
	@Override
	public void save(StockFocus stockFocus) {

		this.stockFocusServiceImpl.save(stockFocus);
	}

}
