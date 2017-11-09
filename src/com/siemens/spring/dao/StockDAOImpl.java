package com.siemens.spring.dao;

import java.util.ListIterator;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.siemens.spring.bean.Stock;

public class StockDAOImpl extends HibernateDaoSupport implements StockDAO {

	@Override
	public void insertStock(Stock stock) {
		this.getHibernateTemplate().save(stock);
	}

	@Override
	public ListIterator<Stock> fetchAllStocks() {
		return (ListIterator<Stock>) this.getHibernateTemplate().find("FROM Stock").listIterator();

	}

}
