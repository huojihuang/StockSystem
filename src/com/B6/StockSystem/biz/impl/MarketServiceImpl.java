/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IMarketService;
import com.B6.StockSystem.dao.IMarketDao;
import com.B6.StockSystem.entities.Market;

/**
 * @author Nike
 * @version2015年5月10日 下午3:18:45
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("marketServiceImpl")
public class MarketServiceImpl implements IMarketService {

	@Resource
	IMarketDao marketSerivceImpl;
	
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IMarketService#save(com.B6.StockSystem.entities.Market)
	 */
	@Override
	public void save(Market market) {

		this.marketSerivceImpl.save(market);
	}

}
