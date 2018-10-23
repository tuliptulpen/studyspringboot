package com.example.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton")
@PropertySource(value = "classpath:book.yml", ignoreResourceNotFound = true,encoding = "UTF-8" )
//@PropertySource(value = "classpath:book.properties", ignoreResourceNotFound = true, encoding = "UTF-8" )
@ConfigurationProperties(prefix = "book")
public class Book {
	
	 @Value("${name}")
	private String name;
	 @Value("${author}")
	private String author;
	 @Value("${price}")
	private  String price;
	
	 public Book () {};
	 
	 public Book(String name,String author,String price) {
		 this.name = name;
		 this.author = author;
		 this.price = price;
	 }

	 //@Value("${book.name}")//会乱码
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//@Value("${book.author}")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//@Value("${book.price}")
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	};
	 
	 
}
