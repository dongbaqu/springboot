package com.cwj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cwj.domain.Book;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 曹文境~
 */
public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage,int pageSize,Book book);
}
