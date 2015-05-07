package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.StockHasDao;
import com.B6.StockSystem.entities.StockHas;

@Scope("prototype")
@Repository("stockHasDaoImpl")
public class StockHasDaoImpl extends DaoImpl<StockHas> implements StockHasDao{

}
