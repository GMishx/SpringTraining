package com.siemens.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Product;
import com.siemens.spring.bean.Theatre;
import com.siemens.spring.service.MovieService;

public class QualifierTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");

		Theatre theatreBean = context.getBean("theatreBean", Theatre.class);

		/*
		 * Movie movie1 = context.getBean("movie1", Movie.class); Movie movie2 =
		 * context.getBean("movie2", Movie.class);
		 */

		System.out.println(theatreBean.getMovie().getName());

		Product product = context.getBean("product", Product.class);
		System.out.println(product);
		
		MovieService serv = context.getBean("MyMovieService", MovieService.class);
		serv.fetchMovie(15);

		((ConfigurableApplicationContext) context).close();

	}

}
