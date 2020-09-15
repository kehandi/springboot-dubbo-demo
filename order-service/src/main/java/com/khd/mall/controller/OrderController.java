package com.khd.mall.controller;

import com.khd.mall.model.User;
import com.khd.mall.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference  //注入要调用的服务
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        //调用服务
        User user= userService.findUserById(id);
        return user;
    }

}
