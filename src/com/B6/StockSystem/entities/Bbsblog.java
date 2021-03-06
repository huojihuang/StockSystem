package com.B6.StockSystem.entities;

// Generated 2015-5-9 15:48:06 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Bbsblog generated by hbm2java
 */
public class Bbsblog implements java.io.Serializable {

	private Integer id;
	private User user;
	private String title;
	private String content;
	private Date dateTime;
	private Boolean isTop;
	private Set comments = new HashSet(0);

	public Bbsblog() {
	}

	public Bbsblog(User user) {
		this.user = user;
	}

	public Bbsblog(User user, String title, String content, Date dateTime,
			Boolean isTop, Set comments) {
		this.user = user;
		this.title = title;
		this.content = content;
		this.dateTime = dateTime;
		this.isTop = isTop;
		this.comments = comments;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Boolean getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}
