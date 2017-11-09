package com.siemens.spring.service;

import java.util.ListIterator;

import org.springframework.transaction.annotation.Transactional;

import com.siemens.spring.bean.Stock;
import com.siemens.spring.dao.StockDAO;

@Transactional(readOnly = false)
public class StockServiceImpl implements StockService {

	StockDAO dao;

	public StockDAO getDao() {
		return dao;
	}

	public void setDao(StockDAO dao) {
		this.dao = dao;
	}

	@Override
	@Transactional(readOnly = false)
	public void insertStock(Stock stock) {
		dao.insertStock(stock);
	}

	@Override
	public ListIterator<Stock> fetchAllStocks() {
		return dao.fetchAllStocks();
	}

}
