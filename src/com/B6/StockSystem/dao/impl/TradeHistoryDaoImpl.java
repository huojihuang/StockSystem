package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.TradeHistoryDao;
import com.B6.StockSystem.entities.TradeHistory;


@Scope("prototype")
@Repository("tradeHistoryDaoImpl")
public class TradeHistoryDaoImpl extends DaoImpl<TradeHistory> implements TradeHistoryDao{

}
