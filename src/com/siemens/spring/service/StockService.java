package com.siemens.spring.service;

import java.util.ListIterator;

import com.siemens.spring.bean.Stock;

public interface StockService {

	void insertStock(Stock stock);

	ListIterator<Stock> fetchAllStocks();
}
