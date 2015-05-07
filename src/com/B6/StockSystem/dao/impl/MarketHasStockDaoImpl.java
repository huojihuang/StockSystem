package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.MarketHasStockDao;
import com.B6.StockSystem.entities.MarketHasStock;

@Scope("prototype")
@Repository("marketHasStockDaoImpl")
public class MarketHasStockDaoImpl extends DaoImpl<MarketHasStock> implements MarketHasStockDao{

}
