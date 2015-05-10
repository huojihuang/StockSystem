/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IStockHistoryService;
import com.B6.StockSystem.dao.IStockHistoryDao;
import com.B6.StockSystem.entities.Stockhistory;

/**
 * @author Nike
 *@version2015年5月10日 下午3:38:43
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("tradeHistoryServiceImpl")
public class TradeHistoryServiceImpl implements IStockHistoryService{
    @Resource
	IStockHistoryDao tradeHistoryServiceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IStockHistoryService#save(com.B6.StockSystem.entities.Stockhistory)
	 */
	@Override
	public void save(Stockhistory stockHistory) {

		this.tradeHistoryServiceImpl.save(stockHistory);
	}

}
