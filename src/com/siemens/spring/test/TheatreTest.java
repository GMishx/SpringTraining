package com.siemens.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.Theatre;
import com.siemens.spring.service.MovieService;

public class TheatreTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("moviebeans.xml");

		Theatre theatreBean = context.getBean("theatreBeanByName", Theatre.class);
		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.fetchMovie(theatreBean.getId());

		System.out.println(context.getBean("theatreBeanByType", Theatre.class).getMovie().getName());
		System.out.println(context.getBean("theatreBeanByConstructor", Theatre.class).getMovie().getName());

		((ConfigurableApplicationContext) context).close();
	}

}
