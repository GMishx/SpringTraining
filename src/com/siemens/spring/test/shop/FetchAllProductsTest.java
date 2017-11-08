package com.siemens.spring.test.shop;

import java.sql.SQLException;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Product;
import com.siemens.spring.service.shop.ProductService;

public class FetchAllProductsTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("daoBeans.xml");

		ProductService service = context.getBean("productService", ProductService.class);

		((ConfigurableApplicationContext) context).close();
		try {
			ListIterator<Product> li = service.fetchAllProducts();
			while (li.hasNext()) {
				System.out.println(li.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
