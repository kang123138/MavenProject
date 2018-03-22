package com.atguigu.spring1;

public class Student {
	private String name;
	private int age;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void show() {
		System.out.println("name：" + name + "-" + "age：" + age + "--" + "address：" + address);
	}
}
