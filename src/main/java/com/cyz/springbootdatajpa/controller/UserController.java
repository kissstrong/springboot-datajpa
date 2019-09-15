package com.cyz.springbootdatajpa.controller;

import com.cyz.springbootdatajpa.dao.U;
import com.cyz.springbootdatajpa.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class UserController {
    @Autowired
    U u;
    //@ResponseBody
@GetMapping("/hello")
    public String test() {
        List<User> all = u.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    System.out.println("///");
    long count = u.count();
    System.out.println(count);
    User user =new User();
    user.setName("张三");
    u.save(user);
    List<User> al = u.findAll();
    for (User use : al) {
        System.out.println(use);
    }
    return "success";
    }

}
