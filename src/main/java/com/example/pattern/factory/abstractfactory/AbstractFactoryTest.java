package com.example.pattern.factory.abstractfactory;

/**
 * @author woshi
 * @title: AbstractFactoryTest
 * @projectName pattern
 * @date 2019/3/14 10:41
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();

        factory = new PythonFactory();
        factory.createCourse().record();
    }
}
