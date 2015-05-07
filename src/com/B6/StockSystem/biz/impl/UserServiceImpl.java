package com.B6.StockSystem.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.B6.StockSystem.biz.IUserService;
import com.B6.StockSystem.dao.IUserDao;
import com.B6.StockSystem.entities.User;


@Transactional(readOnly = false)
@Scope("prototype")
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
	@Resource
	IUserDao userDaoImpl;

	@Override
	public void save(User user) {
		this.userDaoImpl.save(user);
	}

	
}
