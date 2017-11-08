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

public class FetchProductTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("daoBeans.xml");

		ProductService service = context.getBean("productService", ProductService.class);

		((ConfigurableApplicationContext) context).close();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter product id: ");
			int prodId = Integer.parseInt(br.readLine());
			Product p = service.fetchProductById(prodId);
			if (p != null)
				System.out.println(p);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
