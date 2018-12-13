package com.example.demo.com;

import com.example.demo.config.DataBaseContextHolder;
import com.example.demo.entity.User;
import com.example.demo.entity.UserDefine;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserTest;
import com.example.demo.mapper.UserDefineMapper;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/base")
public class Controller {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDefineMapper userDefineMapper;

    @RequestMapping("/user")
    public List<User> getAll() {
        DataBaseContextHolder.setDB("primary");
        return userMapper.selectAll();
    }

    @RequestMapping("/info")
    public List<UserInfo> selectInfos() {
        return userInfoMapper.selectAll();
    }


    @RequestMapping("/page")
    public PageInfo page() {
        return userService.selectAll();
    }

    @RequestMapping("/define")
    public List<UserDefine> selectDefine() {
        DataBaseContextHolder.setDB("second");
        return userDefineMapper.selectAll();
    }

    @RequestMapping("/test")
    public List<UserTest> selectTest() {
        DataBaseContextHolder.setDB("second");
        return userDefineMapper.selectForUserTest();
    }
}
