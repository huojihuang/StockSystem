package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.StockHistoryDao;
import com.B6.StockSystem.entities.StockHistory;


@Scope("prototype")
@Repository("stockHistoryDaoImpl")
public class StockHistoryDaoImpl extends DaoImpl<StockHistory> implements StockHistoryDao{

}
