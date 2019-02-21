package com.yd.demo.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Map<String,Object> map
    ){
        map.put("username",username);
        map.put("password",password);

        if (username.equals("admin") && password.equals("123456")){
            return "dashboard";
        }else {
            return "index";
        }
    }
}
