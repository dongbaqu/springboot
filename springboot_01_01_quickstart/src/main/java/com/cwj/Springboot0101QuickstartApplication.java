package com.cwj;

import com.cwj.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        HelloController bean = applicationContext.getBean(HelloController.class);
        System.out.println(bean);
    }

}
