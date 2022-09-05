package com.cwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹文境~
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${user.name}")
    private String name1;
    @Value("${users[1].age}")
    private String age;

    @Autowired
    private MyDataSource dataSource;
    @GetMapping
    public String hello(){
        System.out.println("hello springboot ?????");
        System.out.println("name===>" + name);
        System.out.println("name1===>" + name1);
        System.out.println("age===>" + age);
        System.out.println("dataSource===>" + dataSource);
        return "hello springboot" + name + name1 + age;
    }
}
