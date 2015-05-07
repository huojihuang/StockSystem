package com.B6.StockSystem.entities;

// default package
// Generated 2015-5-1 21:36:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Stock generated by hbm2java
 */
public class Stock implements java.io.Serializable {

	private int id;
	private Company company;
	private String name;
	private String code;
	private Date publishDate;
	private Set stockHases = new HashSet(0);
	private Set marketHasStocks = new HashSet(0);
	private Set tradehistories = new HashSet(0);
	private Set companies = new HashSet(0);
	private Set stockFocuses = new HashSet(0);
	private Set stockhistories = new HashSet(0);

	public Stock() {
	}

	public Stock(int id, Company company) {
		this.id = id;
		this.company = company;
	}

	public Stock(int id, Company company, String name, String code,
			Date publishDate, Set stockHases, Set marketHasStocks,
			Set tradehistories, Set companies, Set stockFocuses,
			Set stockhistories) {
		this.id = id;
		this.company = company;
		this.name = name;
		this.code = code;
		this.publishDate = publishDate;
		this.stockHases = stockHases;
		this.marketHasStocks = marketHasStocks;
		this.tradehistories = tradehistories;
		this.companies = companies;
		this.stockFocuses = stockFocuses;
		this.stockhistories = stockhistories;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Set getStockHases() {
		return this.stockHases;
	}

	public void setStockHases(Set stockHases) {
		this.stockHases = stockHases;
	}

	public Set getMarketHasStocks() {
		return this.marketHasStocks;
	}

	public void setMarketHasStocks(Set marketHasStocks) {
		this.marketHasStocks = marketHasStocks;
	}

	public Set getTradehistories() {
		return this.tradehistories;
	}

	public void setTradehistories(Set tradehistories) {
		this.tradehistories = tradehistories;
	}

	public Set getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set companies) {
		this.companies = companies;
	}

	public Set getStockFocuses() {
		return this.stockFocuses;
	}

	public void setStockFocuses(Set stockFocuses) {
		this.stockFocuses = stockFocuses;
	}

	public Set getStockhistories() {
		return this.stockhistories;
	}

	public void setStockhistories(Set stockhistories) {
		this.stockhistories = stockhistories;
	}

}
