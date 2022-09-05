package com.cwj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹文境~
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(){
        System.out.println("hello springboot ?????");
        return "hello springboot ?????";
    }
}
