package com.example.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDataSourceAspect {

    @Pointcut("execution( * com.example.demo.mapper.*.*(..))")
    public void daoAspect() {
    }


    @Before("daoAspect()")
    public void switchDataSource(JoinPoint point) {
        if (DataBaseContextHolder.getDB() == null) {
            DataBaseContextHolder.setDB("primary");
        }
        System.out.println("change db:" + DataBaseContextHolder.getDB());

    }
}
