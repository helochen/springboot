package com.example.demo.mapper;

import com.example.demo.entity.UserDefine;
import com.example.demo.entity.UserTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDefineMapper {
    List<UserDefine> selectAll();

    List<UserTest> selectForUserTest();
}
