package com.siemens.spring.test.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Product;
import com.siemens.spring.service.shop.ProductService;

public class AddProductTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("daoBeans.xml");
		
		ProductService service = context.getBean("productService", ProductService.class);
		
		((ConfigurableApplicationContext) context).close();
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//ProductService service = new ProductServiceImpl(user, pass);
			Product p = new Product();
			System.out.print("Enter product Name: ");
			p.setName(br.readLine());
			System.out.print("Enter product Price: ");
			p.setPrice(Double.parseDouble(br.readLine()));
			System.out.print("Enter product Description: ");
			p.setDescription(br.readLine());
			service.addProduct(p);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
