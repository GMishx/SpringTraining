package com.siemens.spring.bean;

import java.io.Serializable;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

// @Entity
// @Table(name="stocks")
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -441795061519933690L;

	// @Id
	// @Column(name="StockID")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;

	// @Column(name="StockName")
	private String stockName;

	// @Column(name="StockPrice")
	private double price;

	public int getStockId() {
		return stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public double getPrice() {
		return price;
	}

	public Stock setStockId(int stockId) {
		this.stockId = stockId;
		return this;
	}

	public Stock setStockName(String stockName) {
		this.stockName = stockName;
		return this;
	}

	public Stock setPrice(double price) {
		this.price = price;
		return this;
	}

}
