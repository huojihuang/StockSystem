/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IMarketHasStockService;
import com.B6.StockSystem.dao.IMarketHasStockDao;
import com.B6.StockSystem.entities.MarketHasStock;

/**
 * @author Nike
 *@version2015年5月10日 下午3:15:45
 */

@Transactional(readOnly = false)
@Scope("prototype")
@Service("marketHasStockServiceImpl")
public class MarketHasStockServiceImpl implements IMarketHasStockService{

	@Resource
	IMarketHasStockDao marketHasStockServiceImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IMarketHasStockService#save(com.B6.StockSystem.entities.MarketHasStock)
	 */
	@Override
	public void save(MarketHasStock marketHasStock) {

		this.marketHasStockServiceImpl.save(marketHasStock);
	}

}
