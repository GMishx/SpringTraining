package com.siemens.spring.service.shop;

import java.sql.SQLException;
import java.util.ListIterator;

import com.siemens.spring.bean.Product;

public interface ProductService {
	int addProduct(Product prod) throws SQLException;

	boolean deleteProduct(int prodId) throws SQLException;

	boolean updateProduct(Product prod) throws SQLException;

	Product fetchProductById(int prodId) throws SQLException;

	ListIterator<Product> fetchAllProducts() throws SQLException;
}
