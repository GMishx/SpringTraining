package com.siemens.spring.dao;

import org.springframework.stereotype.Repository;

import com.siemens.spring.bean.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	@Override
	public void addProduct(Product prod) {
		System.out.println("Adding product: " + prod);
	}

}
