package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //@Select("select * from USER WHERE 1 = 1")
    List<User> selectAll();
}
