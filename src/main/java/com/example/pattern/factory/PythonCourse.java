package com.example.pattern.factory;

/**
 * @author woshi
 * @title: PythonClass
 * @projectName pattern
 * @description: TODO
 * @date 2019/3/148:44
 */
public class PythonCourse implements ICourse{

    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
