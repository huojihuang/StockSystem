/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IStockHasService;
import com.B6.StockSystem.dao.IStockHasDao;
import com.B6.StockSystem.entities.StockHas;

/**
 * @author Nike
 *@version2015年5月10日 下午3:26:51
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("stockHasServiceImpl")
public class StockHasServiceImpl implements IStockHasService{

	@Resource
	IStockHasDao stockHasServiceImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IStockHasService#save(com.B6.StockSystem.entities.StockHas)
	 */
	@Override
	public void save(StockHas stockHas) {

		this.stockHasServiceImpl.save(stockHas);
	}

}
