/**
 * 
 */
package com.B6.StockSystem.biz.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.ICompanyService;
import com.B6.StockSystem.dao.ICompanyDao;
import com.B6.StockSystem.entities.Company;

/**
 * @author Nike
 *@version2015年5月10日 下午3:11:32
 */

@Transactional(readOnly = false)
@Scope("prototype")
@Service("companyServiceImpl")
public class CompanyServiceImpl implements ICompanyService{

	ICompanyDao companyServiceimpl;
	/* (non-Javadoc)
	 * @see com.B6.StockSystem.biz.ICompanyService#save(com.B6.StockSystem.entities.Company)
	 */
	@Override
	public void save(Company company) {

		this.companyServiceimpl.save(company);
	}

}
