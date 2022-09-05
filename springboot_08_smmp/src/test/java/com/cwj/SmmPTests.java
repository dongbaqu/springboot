package com.cwj;

/**
 * @author 曹文境~
 */
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cwj.dao.BookDao;
import com.cwj.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmmPTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void insert(){
        Book book = new Book();
        book.setName("测试123");
        book.setType("测试123");
        book.setDescription("测试123");
        bookDao.insert(book);
    }

    @Test
    void getPage(){
        IPage page = new Page(0,5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }

    @Test
    void getByLike(){
        String name = "1";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name != null,Book::getName,name);
        bookDao.selectList(lambdaQueryWrapper);
    }

}