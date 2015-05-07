package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.ExpectedDao;
import com.B6.StockSystem.entities.Expected;

@Scope("prototype")
@Repository("expectedDaoImpl")
public class ExpectedDaoImpl extends DaoImpl<Expected> implements ExpectedDao{

}
