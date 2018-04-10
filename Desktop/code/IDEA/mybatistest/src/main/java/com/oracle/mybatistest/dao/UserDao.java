package com.oracle.mybatistest.dao;

import com.oracle.mybatistest.po.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM users where id=#{id}")
    @Results({
            @Result(id=true,property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password")
    })
    User findById(@Param("id") int id);
}