package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.Book;


@Controller
public class BookController {
	
	@Autowired
    private Book book;	  
	
	@RequestMapping("/book")
	@ResponseBody
	public String readBook() {
		return "emmmm..... The BookName is "
					+book.getName()
					+";and Book Author is "
					+book.getAuthor()
					+";and Book price is "
					+book.getPrice();

	}
}
