package com.B6.StockSystem.entities;

// default package
// Generated 2015-5-1 21:36:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Expected generated by hbm2java
 */
public class Expected implements java.io.Serializable {

	private int id;
	private StockFocus stockFocus;
	private String price;
	private Date dateTime;
	private String operation;

	public Expected() {
	}

	public Expected(int id, StockFocus stockFocus) {
		this.id = id;
		this.stockFocus = stockFocus;
	}

	public Expected(int id, StockFocus stockFocus, String price, Date dateTime,
			String operation) {
		this.id = id;
		this.stockFocus = stockFocus;
		this.price = price;
		this.dateTime = dateTime;
		this.operation = operation;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StockFocus getStockFocus() {
		return this.stockFocus;
	}

	public void setStockFocus(StockFocus stockFocus) {
		this.stockFocus = stockFocus;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
