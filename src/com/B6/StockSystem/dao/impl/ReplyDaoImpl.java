package com.B6.StockSystem.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.B6.StockSystem.dao.ReplyDao;
import com.B6.StockSystem.entities.Reply;

@Scope("prototype")
@Repository("replyDaoImpl")
public class ReplyDaoImpl extends DaoImpl<Reply> implements ReplyDao{

}
