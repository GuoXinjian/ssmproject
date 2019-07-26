package com.gxj.controller;

import com.gxj.model.User;
import com.gxj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private UserService userService;

    @GetMapping("/sayHello")
    public String sayHello(Model model){
        return "hello";
    }

    @RequestMapping("/hello")
    public String hello() {
        List<User> userList=userService.findAll();
        for (User user:userList) {
            System.out.println("id: "+user.getId());
            System.out.println("name: "+user.getName());
        }
        System.out.println("Hello~");
        return "hello";
    }



}
