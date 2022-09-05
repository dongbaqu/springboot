package com.cwj.dao;

import com.cwj.dao.impl.HelloDao;
import org.springframework.stereotype.Repository;

/**
 * @author 曹文境~
 */
@Repository
public class HelloDaoImpl implements HelloDao {

    @Override
    public void save() {
        System.out.println("hello ....");
    }
}
