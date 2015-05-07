package com.B6.StockSystem.dao;

import java.util.List;

import org.hibernate.Query;

/**
 * 
 * @author Strong
 *
 * @param <T>
 */
public interface IDao<T> {

	/**
	 *  get list by hql
	 * 
	 * @param hql
	 * @return
	 */

	public List<T> list(String hql);

	/**
	 * 
	 * @param t
	 */
	public void save(T t);

	
	/**
	 * 
	 * @param t
	 */
	public void delete(T t);
	
	
	/**
	 * @param queryString
	 * @return
	 */
	public Query getQueryObject(String queryString);

}
