package com.siemens.spring.service.shop;

import java.sql.SQLException;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Required;

import com.siemens.spring.bean.Product;
import com.siemens.spring.dao.shop.ProductDAO;

public class ProductServiceImpl implements ProductService {

	private ProductDAO dao;

	@Required
	public ProductServiceImpl setDao(ProductDAO dao) {
		this.dao = dao;
		return this;
	}

	@Override
	public int addProduct(Product prod) throws SQLException {
		int retVal = dao.insertProduct(prod);
		if (retVal < 0) {
			System.out.println("Unable to add product");
		} else {
			System.out.println("Product added with id: " + retVal);
		}
		return retVal;
	}

	@Override
	public boolean deleteProduct(int prodId) throws SQLException {
		boolean retVal = dao.deleteProduct(prodId);
		if (!retVal) {
			System.out.println("Unable to delete product");
		} else {
			System.out.println("Product with id: " + prodId + " deleted successfully!");
		}
		return retVal;
	}

	@Override
	public boolean updateProduct(Product prod) throws SQLException {
		boolean retVal = dao.updateProduct(prod);
		if (!retVal) {
			System.out.println("Unable to update product");
		} else {
			System.out.println("Product with id: " + prod.getId() + " updated successfully!");
		}
		return retVal;
	}

	@Override
	public Product fetchProductById(int prodId) throws SQLException {
		Product retVal = dao.fetchProductById(prodId);
		if (retVal == null) {
			System.out.println("No product with id: " + prodId);
		}
		return retVal;
	}

	@Override
	public ListIterator<Product> fetchAllProducts() throws SQLException {
		ListIterator<Product> retVal = dao.fetchAllProducts();
		if (retVal == null) {
			System.out.println("No products in db");
		}
		return retVal;
	}

}
