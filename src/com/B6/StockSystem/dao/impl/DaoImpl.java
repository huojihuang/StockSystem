package com.B6.StockSystem.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.IDao;

/**
 * 
 * @author Strong
 *
 * @param <T>
 */

@Scope("prototype")
@Repository("dao")
public class DaoImpl<T> implements IDao<T> {

	protected SessionFactory sessionFactory;

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<T> list(String queryString) {

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createQuery(queryString);

		return query.list();

	}
	
	public Query getQueryObject(String queryString){
		
		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createQuery(queryString);
		
		return query;
	}

	public Object query(String queryString) {

		Session session = this.sessionFactory.getCurrentSession();

		return session.createQuery(queryString).uniqueResult();

	}

	public void delete(T o) {

		Session session = this.sessionFactory.getCurrentSession();

		session.delete(o);

	}

	public void save(T t) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(t);
	}

	
}
