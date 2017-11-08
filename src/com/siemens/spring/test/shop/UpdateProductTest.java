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

public class UpdateProductTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("daoBeans.xml");

		ProductService service = context.getBean("productService", ProductService.class);

		((ConfigurableApplicationContext) context).close();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Product p = new Product();
			System.out.print("Enter product id to be updated: ");
			p.setId(Integer.parseInt(br.readLine()));
			System.out.print("Enter new product Name: ");
			p.setName(br.readLine());
			System.out.print("Enter new product Price: ");
			p.setPrice(Double.parseDouble(br.readLine()));
			System.out.print("Enter new product Description: ");
			p.setDescription(br.readLine());
			service.updateProduct(p);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
