package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.BbsBlogDao;
import com.B6.StockSystem.entities.Bbsblog;



@Scope("prototype")
@Repository("bbsDaoImpl")
public class BbsDaoImpl extends DaoImpl<Bbsblog> implements BbsBlogDao{

}
