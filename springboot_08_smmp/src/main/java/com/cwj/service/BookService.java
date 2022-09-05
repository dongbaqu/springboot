package com.cwj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cwj.domain.Book;

import java.util.List;

/**
 * @author 曹文境~
 */
public interface BookService {
    /**
     * 添加book
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 修改book
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 根据id查询book信息
     * @param id
     * @return
     */
    Book queryById(Integer id);

    /**
     * 查询所有的book信息
     * @return
     */
    List<Book> queryAll();

    /**
     * 根据id删除book
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 设置当前页号，和数据条数，分页查询数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    IPage<Book> getPage(int currentPage,int pageSize);
}
