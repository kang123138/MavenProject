package com.atguigu.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring3.CartItem;

class TestCartItem {

	ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
	@Test
	void test() {
		CartItem car = (CartItem) ioc.getBean("cartItem2");
		System.out.println(car);
	}
	
	@Test
	void test1() {
		CartItem car = (CartItem) ioc.getBean("cartItem");
		System.out.println(car);
	}

}
