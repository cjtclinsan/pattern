package com.example.pattern.factory.factorymethod;

import com.example.pattern.factory.ICourse;

/**
 * @author woshi
 * @title: FactoryMethodTest
 * @projectName pattern
 * @description: TODO
 * @date 2019/3/149:23
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
