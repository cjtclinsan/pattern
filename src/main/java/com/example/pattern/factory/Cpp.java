package com.example.pattern.factory;

/**
 * @author woshi
 * @title: Cpp
 * @projectName pattern
 * @date 2019/3/14 11:27
 */
public class Cpp implements ICourse {
    @Override
    public void record() {
        System.out.println("创建cpp课程");
    }
}
