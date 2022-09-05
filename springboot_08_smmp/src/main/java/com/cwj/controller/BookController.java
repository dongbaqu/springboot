package com.cwj.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cwj.domain.Book;
import com.cwj.service.BookService;
import com.cwj.service.IBookService;
import com.cwj.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author 曹文境~
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R queryALl(){
        return new R(true,bookService.list());
    }

    @GetMapping("{id}")
    public R queryBook(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(true,bookService.removeById(id));
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(true,bookService.updateById(book));
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功^_^":"添加失败 ~_~!");
    }

//    @GetMapping("/{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        Page<Book> page = new Page<>(currentPage,pageSize);
//        if (currentPage > page.getPages()){
//            page = new Page<>(page.getPages(),pageSize);
//        }
//        return new R(true,bookService.page(page,null));
//    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        IPage<Book> page = bookService.getPage(currentPage,pageSize,book);
        if (currentPage > page.getPages()){
            page = bookService.getPage(currentPage,pageSize,book);
        }
        return new R(true,page);
    }
}
