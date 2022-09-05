package com.cwj;

import com.cwj.Springboot04JunitApplication;
import com.cwj.dao.impl.HelloDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot04JunitApplication.class)
class Springboot04JunitApplicationTests {
    @Autowired
    private HelloDao helloDao;
    @Test
    void contextLoads() {
        helloDao.save();
    }

}
