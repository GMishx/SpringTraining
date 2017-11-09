package com.siemens.spring.dao;

import java.util.ListIterator;

import com.siemens.spring.bean.Stock;

public interface StockDAO {

	void insertStock(Stock stock);

	ListIterator<Stock> fetchAllStocks();
}
