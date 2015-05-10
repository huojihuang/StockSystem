/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IBankCardService;
import com.B6.StockSystem.dao.IBankCardDao;
import com.B6.StockSystem.entities.Bankcard;

/**
 * @author Nike
 *@version2015年5月10日 下午3:00:03
 */


@Transactional(readOnly = false)
@Scope("prototype")
@Service("bankCardServiceImpl")
public class BankCardServiceImpl implements IBankCardService{

	 @Resource
	 IBankCardDao BankCardDaoImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IBankCardService#save(com.B6.StockSystem.entities.Bankcard)
	 */
	@Override
	public void save(Bankcard bankCard) {
		this.BankCardDaoImpl.save(bankCard);
		
	}

}
