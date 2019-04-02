package com.yd.demo.controller;

import com.yd.demo.beans.Emplyee;
import com.yd.demo.dao.EmplyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmplyeeController {

    @Autowired
    private EmplyeeDao emplyeeDao;

    @GetMapping("/emps")
    public String list(){
        List<Emplyee> emps = emplyeeDao.getEmps();
        System.out.println(emps);
        return "emps/list";
    }
}
