package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloDemo {
	@RequestMapping("/hello")
	@ResponseBody
	public String heelo() {
		return "-------hello spring boot !!!!!!!!!";
	}
}


/*@RestController
public class HelloDemo {

	@RequestMapping("/hellodemo")
	public String welcomfun() {
		return "-------hello spring boot !!!!!!!!!";
	}
}*/
