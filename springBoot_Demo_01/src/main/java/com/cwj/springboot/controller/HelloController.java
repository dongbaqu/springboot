package com.cwj.springboot.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 曹文境~
 */
@ResponseBody
@Controller

public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot 2022/08/31";
    }
}
