package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.StockDao;
import com.B6.StockSystem.entities.Stock;

@Scope("prototype")
@Repository("stockDaoImpl")
public class StockDaoImpl extends DaoImpl<Stock> implements StockDao{

}
