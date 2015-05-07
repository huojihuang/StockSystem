package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.BankCardDao;
import com.B6.StockSystem.entities.Bankcard;

@Scope("prototype")
@Repository("bankCardDaoImpl")
public class BankCardDaoImpl extends DaoImpl<Bankcard> implements BankCardDao{

}
