package com.cwj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cwj.domain.Book;
import com.cwj.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 曹文境~
 */
@SpringBootTest
class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void queryById() {
        System.out.println(bookService.queryById(11));
    }

    @Test
    void queryAll() {
        System.out.println(bookService.queryAll());
    }

    @Test
    void delete() {
    }

    @Test
    void getPage() {
        IPage<Book> page = bookService.getPage(1, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}