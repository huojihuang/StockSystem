package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.StockFocusDao;
import com.B6.StockSystem.entities.StockFocus;


@Scope("prototype")
@Repository("stockFocusDaoImpl")
public class StockFocusDaoImpl extends DaoImpl<StockFocus> implements StockFocusDao{

}
