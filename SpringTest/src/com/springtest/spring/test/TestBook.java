package com.atguigu.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring2.Book;
class TestBook {
	
	// chuangjainIOCduixiang
	ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
	// tongguoidhuoqu
	@Test
	void test() {
		// huoquBookduixiang
		Book book = (Book) ioc.getBean("book10");
		
		System.out.println(book);
	}

	// tongguoleixinghuoqu
	
	@Test
	public void test1() {
		Book book = ioc.getBean(Book.class);
		System.out.println(book);
	}
	
	// tongguogouzaoqiweishuxingfuzhi
	@Test
	public void test2() {
		Book book = (Book) ioc.getBean("book5");
		System.out.println(book);
	}
	
	@Test
	public void test3() {
		Book book = (Book) ioc.getBean("book3");
		System.out.println(book);
	}
	
	@Test
	void test4() {
		Book book = (Book) ioc.getBean("book4");
		System.out.println(book);
	}
}
