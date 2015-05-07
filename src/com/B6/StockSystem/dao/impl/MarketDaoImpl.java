package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.MarketDao;
import com.B6.StockSystem.entities.Market;

@Scope("prototype")
@Repository("marketDaoImpl")
public class MarketDaoImpl extends DaoImpl<Market> implements MarketDao {

}
