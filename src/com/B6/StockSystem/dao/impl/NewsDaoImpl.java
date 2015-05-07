package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.NewsDao;
import com.B6.StockSystem.entities.News;

@Scope("prototype")
@Repository("newsDaoImpl")
public class NewsDaoImpl extends DaoImpl<News> implements NewsDao{

}
