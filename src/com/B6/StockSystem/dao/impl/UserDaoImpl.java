package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.IUserDao;
import com.B6.StockSystem.entities.User;

@Scope("prototype")
@Repository("userDaoImpl")
public class UserDaoImpl extends DaoImpl<User> implements IUserDao {
   
}
