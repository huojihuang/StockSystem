package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.CommentDao;
import com.B6.StockSystem.entities.Comment;



@Scope("prototype")
@Repository("commentDaoImpl")
public class CommentDaoImpl extends DaoImpl<Comment> implements CommentDao{

}
