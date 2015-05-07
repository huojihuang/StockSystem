package com.B6.StockSystem.biz;

import java.util.List;

import com.B6.StockSystem.entities.User;

/**
 * User的业务逻辑层
 * 
 * @author Strong
 *
 */
public interface IUserService {
	/**
	 * 通过调用数据访问层的save方法，向数据库中存入用户信息
	 * 
	 * @param user
	 */
	public void save(User user);

}
