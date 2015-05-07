package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.CompanyDao;
import com.B6.StockSystem.entities.Company;

@Scope("prototype")
@Repository("companyDaoImpl")
public class CompanyDaoImpl extends DaoImpl<Company> implements CompanyDao {

}
