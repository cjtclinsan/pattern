package com.example.pattern.factory.factorymethod;

import com.example.pattern.factory.ICourse;
import com.example.pattern.factory.JavaCourse;

/**
 * @author woshi
 * @title: JavaCourseFactory
 * @projectName pattern
 * @description: TODO
 * @date 2019/3/149:16
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
