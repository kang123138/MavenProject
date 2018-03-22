package com.atguigu.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring4.BookShop;

class TestBookShop {

	ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
	@Test
	void test() {
		BookShop book = (BookShop) ioc.getBean("bookshop");
		System.out.println(book);
	}

}
