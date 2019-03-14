package com.example.pattern.factory.simplefactory;

import com.example.pattern.factory.ICourse;
import com.example.pattern.factory.JavaCourse;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);

        course.record();
    }
}
