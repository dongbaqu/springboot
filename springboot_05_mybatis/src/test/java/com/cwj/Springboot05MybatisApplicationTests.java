package com.cwj;

import com.cwj.dao.AdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {
    @Autowired
    private AdminDao adminDao;
    @Test
    void contextLoads() {
        System.out.println(adminDao.getAdminById(201507002));
    }

}
