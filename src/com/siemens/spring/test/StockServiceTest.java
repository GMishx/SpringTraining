package com.siemens.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Stock;
import com.siemens.spring.service.StockService;

public class StockServiceTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("stockbeans.xml");

		StockService service = context.getBean("stockService", StockService.class);

		service.insertStock(new Stock().setStockName("TATAMOT").setPrice(3500));

		((ConfigurableApplicationContext) context).close();
	}

}
