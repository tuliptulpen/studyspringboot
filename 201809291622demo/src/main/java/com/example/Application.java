package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Book;
import com.example.demo.test.TestConfiguration;




@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		
		  SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
	        //修改Banner的模式为OFF,启动时控制台将不打印显示字符wow
	        builder.bannerMode(Banner.Mode.OFF).run(args);
	        @SuppressWarnings("resource")
			ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

	        Book bookconfig = context.getBean(Book.class);
	        Book bookconfig2 =  context.getBean(Book.class);
	  
	        System.out.println( "测试@Scope注解的类的设计模式"+bookconfig.equals(bookconfig2));
	    	System.out.println( "emmmm..... The BookName is "
																+bookconfig.getName()
																+";and Book Author is "
																+bookconfig.getAuthor()
																+";and Book price is "
																+bookconfig.getPrice());
	        
		//SpringApplication.run(Application.class, args);//默认启动方式
	}


}
