package com.atguigu.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring1.Student;

class TestStudent {

	@Test
	void test() {
		// 使用IOC容器创建 对象
		ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		
		// 使用IOC获取Student对象
		Student stu = (Student) ioc.getBean("stu");
		
		// 调用Student中的方法
		stu.show();
	}

}
