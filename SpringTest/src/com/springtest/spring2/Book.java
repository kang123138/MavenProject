package com.atguigu.spring2;

public class Book {
	private Integer id;
	private String title;
	private String author;
	private double price;
	private int sales;
	
	public Book(Integer id, String title, String author, double price, int sales) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.sales = sales;
	}
	
	



	public Book(Integer id, String title, String author, int sales) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.sales = sales;
		System.out.println("NoPrice");
	}

	public Book(Integer id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("NoSales");
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", sales=" + sales
				+ "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
}
