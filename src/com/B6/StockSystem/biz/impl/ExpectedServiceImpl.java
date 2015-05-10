/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IExpectedService;
import com.B6.StockSystem.dao.IExpectedDao;
import com.B6.StockSystem.entities.Expected;

/**
 * @author Nike
 *@version2015年5月10日 下午3:13:24
 */

@Transactional(readOnly = false)
@Scope("prototype")
@Service("expectedServiceImpl")
public class ExpectedServiceImpl implements IExpectedService{

	@Resource
	IExpectedDao expectedServiceImpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.IExpectedService#save(com.B6.StockSystem.entities.Expected)
	 */
	@Override
	public void save(Expected expected) {

		this.expectedServiceImpl.save(expected);
	}

}
