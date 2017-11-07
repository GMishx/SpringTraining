package com.siemens.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import com.siemens.spring.bean.Product;
import com.siemens.spring.dao.ProductDAO;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private ProductDAO dao = null;
	
	@Override
	public void addProduct(Product prod) {
		dao.addProduct(prod);
	}

	public ProductDAO getDao() {
		return dao;
	}

	@Required
	@Autowired
	@Qualifier("productDAO")
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	

}
