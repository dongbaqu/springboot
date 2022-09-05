package com.cwj.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cwj.domain.Book;
import com.cwj.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 曹文境~
 */
@SpringBootTest
class IBookServiceImplTest {
    @Autowired
    private IBookService ibookService;

    @Test
    void save() {
        Book book = new Book();
        book.setName("123----------");
        book.setType("123");
        book.setDescription("123");
        ibookService.save(book);
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(14);
        book.setName("123");
        book.setType("123");
        book.setDescription("123");
        ibookService.updateById(book);
    }

    @Test
    void queryById() {
        System.out.println(ibookService.getById(11));
    }

    @Test
    void queryAll() {
        System.out.println(ibookService.list());
    }

    @Test
    void delete() {
        ibookService.removeById(13);
    }

    @Test
    void getPage() {
        Page<Book> page = new Page<>(1, 5);
        ibookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }
}