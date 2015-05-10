package com.B6.StockSystem.entities;

// Generated 2015-5-9 15:48:06 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MarketHasStock generated by hbm2java
 */
public class MarketHasStock implements java.io.Serializable {

	private Integer id;
	private Market market;
	private Stock stock;
	private Date dateTime;
	private Double openingPrice;
	private Double closingPrice;
	private Double currentPrice;
	private Double hprice;
	private Double lprice;
	private Integer totalNumber;
	private Double turnover;
	private Double rate;

	public MarketHasStock() {
	}

	public MarketHasStock(Market market, Stock stock) {
		this.market = market;
		this.stock = stock;
	}

	public MarketHasStock(Market market, Stock stock, Date dateTime,
			Double openingPrice, Double closingPrice, Double currentPrice,
			Double hprice, Double lprice, Integer totalNumber, Double turnover,
			Double rate) {
		this.market = market;
		this.stock = stock;
		this.dateTime = dateTime;
		this.openingPrice = openingPrice;
		this.closingPrice = closingPrice;
		this.currentPrice = currentPrice;
		this.hprice = hprice;
		this.lprice = lprice;
		this.totalNumber = totalNumber;
		this.turnover = turnover;
		this.rate = rate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Double getOpeningPrice() {
		return this.openingPrice;
	}

	public void setOpeningPrice(Double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public Double getClosingPrice() {
		return this.closingPrice;
	}

	public void setClosingPrice(Double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public Double getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Double getHprice() {
		return this.hprice;
	}

	public void setHprice(Double hprice) {
		this.hprice = hprice;
	}

	public Double getLprice() {
		return this.lprice;
	}

	public void setLprice(Double lprice) {
		this.lprice = lprice;
	}

	public Integer getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Double getTurnover() {
		return this.turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
