package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;
import com.example.util.PlantUuid;

@RestController
public class UserController {
	@RequestMapping("/getUser")
    public User getUser() {
    	User user= new User();
    	user.setId(PlantUuid.moreUuid(1));
    	user.setName("ahei");
    	user.setPwd("123456");
        return user;
    }
}
