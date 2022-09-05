package com.cwj.dao;

import com.cwj.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 曹文境~
 */
@Mapper
@Repository
public interface AdminDao {
    @Select("select * from admin where id = #{id}")
    public Admin getAdminById(Integer id);
}
