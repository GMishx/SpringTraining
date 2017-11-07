package com.siemens.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Product;
import com.siemens.spring.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");
		
		ProductService serv = context.getBean("productService", ProductService.class);
		Product prod = context.getBean("product", Product.class);
		prod.setDescription("Haa");
		prod.setPrice(100000000);
		prod.setName("D");
		serv.addProduct(prod);
		
		((ConfigurableApplicationContext)context).close();
	}

}
