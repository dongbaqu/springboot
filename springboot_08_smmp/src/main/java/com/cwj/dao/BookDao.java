package com.cwj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cwj.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 曹文境~
 */
@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {

}
